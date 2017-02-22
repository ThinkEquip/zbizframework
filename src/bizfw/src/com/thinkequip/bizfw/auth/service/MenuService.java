package com.thinkequip.bizfw.auth.service;

import java.util.List;

import com.thinkequip.bizfw.auth.model.Menu;
import com.thinkequip.bizfw.auth.model.Role;
import com.thinkequip.bizfw.base.BaseService;
import com.thinkequip.bizfw.base.BizfwServiceException;

public interface MenuService extends BaseService<Menu> {

	public Menu getAllMenuTree() throws BizfwServiceException;

	public void addMenu(Menu menu) throws BizfwServiceException;

	public void modifyMenu(Menu menu) throws BizfwServiceException;

	public void deleteMenu(String menuId) throws BizfwServiceException;

	public void setMenuOfRole(Role role, List<String> menuIdList) throws BizfwServiceException;

	public List<Menu> getChildMenuList(Menu menu) throws BizfwServiceException;

	public List<Menu> getMenuListByRole(Role role) throws BizfwServiceException;

	public Menu getMenuTreeByPeople(String peopleId) throws BizfwServiceException;

	public Menu convertListToTree(List<Menu> list, Menu rootMenu) throws BizfwServiceException;

	public long getChildMenuCount(Menu menu) throws BizfwServiceException;

	public void deleteRoleMenuRelationByMenu(String menuId) throws BizfwServiceException;

}
