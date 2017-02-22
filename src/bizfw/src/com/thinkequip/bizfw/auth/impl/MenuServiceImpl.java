package com.thinkequip.bizfw.auth.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkequip.bizfw.auth.dao.MenuDao;
import com.thinkequip.bizfw.auth.dao.RoleMenuRelationDao;
import com.thinkequip.bizfw.auth.model.Menu;
import com.thinkequip.bizfw.auth.model.Role;
import com.thinkequip.bizfw.auth.model.RoleMenuRelation;
import com.thinkequip.bizfw.auth.service.MenuService;
import com.thinkequip.bizfw.auth.service.RoleService;
import com.thinkequip.bizfw.base.BaseDao;
import com.thinkequip.bizfw.base.BizfwServiceException;
import com.thinkequip.bizfw.base.common.ListUtils;
import com.thinkequip.bizfw.base.consts.ErrorCode;
import com.thinkequip.bizfw.base.impl.BaseServiceImpl;

@Service("menuService")
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {

	@Autowired
	private RoleService roleService;

	@Autowired
	private MenuDao menuDao;

	@Autowired
	private RoleMenuRelationDao roleMenuRelationDao;

	@Override
	public Menu getAllMenuTree() throws BizfwServiceException {
		List<Menu> list = menuDao.list();
		ListUtils.sort(list, Menu.COLUMN_ORDERS);
		Menu rootMenu = menuDao.getRootMenu();
		Menu menu = convertListToTree(list, rootMenu);
		return menu;
	}

	@Transactional
	@Override
	public void addMenu(Menu menu) throws BizfwServiceException {
		Menu parentMenu = queryById(menu.getParentMenuId());
		if (parentMenu == null) {
			throw new BizfwServiceException(ErrorCode.Auth.Menu.ADD_FAIL_WITHOUT_PARENT);
		}
		save(menu);
	}

	@Transactional
	@Override
	public void modifyMenu(Menu menu) throws BizfwServiceException {
		Menu dbMenu = queryById(menu.getIdBfMenu());
		dbMenu.setName(menu.getName());
		dbMenu.setUrl(menu.getUrl());
		dbMenu.setOrders(menu.getOrders());
		dbMenu.update(menu.getUpdateBy());
		update(dbMenu);
	}

	@Transactional
	@Override
	public void deleteMenu(String menuId) throws BizfwServiceException {
		Menu menu = queryById(menuId);
		checkCanDelete(menu);
		delete(menuId);
		deleteRoleMenuRelationByMenu(menuId);
	}

	@Transactional
	@Override
	public void setMenuOfRole(Role role, List<String> menuIdList) throws BizfwServiceException {
		deleteRoleMenuRelationByRole(role.getIdBfRole());
		for (String menuId : menuIdList) {
			Menu menu = queryById(menuId);
			if (menu == null) {
				throw new BizfwServiceException(ErrorCode.Auth.Role.SET_MENU_REL_FAIL_MENU_NOT_FOUND, menuId);
			}
			RoleMenuRelation roleMenuRelation = new RoleMenuRelation(role.getUpdateBy(), role.getIdBfRole(),
					menu.getIdBfMenu());
			roleMenuRelationDao.save(roleMenuRelation);
		}
	}

	@Override
	public List<Menu> getChildMenuList(Menu menu) throws BizfwServiceException {
		List<Menu> menuList = queryByFieldAndValue(Menu.COLUMN_PARENT_MENU_ID, menu.getIdBfMenu());
		return menuList;
	}

	@Override
	public List<Menu> getMenuListByRole(Role role) throws BizfwServiceException {
		List<Menu> menuList = new ArrayList<Menu>();
		List<RoleMenuRelation> relationList = roleMenuRelationDao.queryByFieldAndValue(RoleMenuRelation.COLUMN_ROLE_ID,
				role.getIdBfRole());
		for (RoleMenuRelation relation : relationList) {
			Menu menu = queryById(relation.getMenuId());
			menuList.add(menu);
		}
		return menuList;
	}

	@Override
	public Menu getMenuTreeByPeople(String peopleId) throws BizfwServiceException {
		List<Menu> resultMenuList = new ArrayList<Menu>();
		List<Role> roleList = roleService.getRoleListByPeople(peopleId);
		for (Role role : roleList) {
			List<Menu> menuList = getMenuListByRole(role);
			for (Menu menu : menuList) {
				if (!resultMenuList.contains(menu)) {
					resultMenuList.add(menu);
				}
			}
		}
		ListUtils.sort(resultMenuList, Menu.COLUMN_ORDERS);
		Menu rootMenu = menuDao.getRootMenu();
		Menu menu = convertListToTree(resultMenuList, rootMenu);
		return menu;
	}

	@Override
	public Menu convertListToTree(List<Menu> list, Menu rootMenu) throws BizfwServiceException {
		List<Menu> childList = new ArrayList<Menu>();
		for (Menu menu : list) {
			if (rootMenu.getIdBfMenu().equals(menu.getParentMenuId())) {
				Menu childMenu = convertListToTree(list, menu);
				childList.add(childMenu);
			}
		}
		rootMenu.setChildList(childList);
		return rootMenu;
	}

	@Override
	public long getChildMenuCount(Menu menu) throws BizfwServiceException {
		long count = menuDao.getCountByFieldAndValue(Menu.COLUMN_PARENT_MENU_ID, menu.getIdBfMenu());
		return count;
	}

	@Override
	public void deleteRoleMenuRelationByMenu(String menuId) throws BizfwServiceException {
		roleMenuRelationDao.deleteByFieldAndValue(RoleMenuRelation.COLUMN_MENU_ID, menuId);
	}

	private void deleteRoleMenuRelationByRole(String roleId) throws BizfwServiceException {
		roleMenuRelationDao.deleteByFieldAndValue(RoleMenuRelation.COLUMN_ROLE_ID, roleId);
	}

	private void checkCanDelete(Menu menu) throws BizfwServiceException {
		long childCount = getChildMenuCount(menu);
		if (childCount > 0) {
			throw new BizfwServiceException(ErrorCode.Auth.Menu.DEL_FAIL_WITH_CHILD);
		}
	}

	@Override
	public BaseDao<Menu> getBaseDao() {
		return menuDao;
	}

}
