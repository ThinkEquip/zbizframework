package com.thinkequip.bizfw.auth.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkequip.bizfw.auth.dao.PeopleRoleRelDao;
import com.thinkequip.bizfw.auth.dao.RoleDao;
import com.thinkequip.bizfw.auth.dao.RoleMenuRelationDao;
import com.thinkequip.bizfw.auth.model.PeopleRoleRelation;
import com.thinkequip.bizfw.auth.model.Role;
import com.thinkequip.bizfw.auth.service.MenuService;
import com.thinkequip.bizfw.auth.service.RoleService;
import com.thinkequip.bizfw.base.BaseDao;
import com.thinkequip.bizfw.base.BizfwServiceException;
import com.thinkequip.bizfw.base.common.ListUtils;
import com.thinkequip.bizfw.base.consts.ErrorCode;
import com.thinkequip.bizfw.base.impl.BaseServiceImpl;
import com.thinkequip.bizfw.po.model.People;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

	@Autowired
	private MenuService menuService;

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private RoleMenuRelationDao roleMenuRelationDao;

	@Autowired
	private PeopleRoleRelDao peopleRoleRelDao;

	@Override
	public List<Role> getRoleList() throws BizfwServiceException {
		return roleDao.list();
	}

	@Transactional
	@Override
	public void addRole(Role role) throws BizfwServiceException {
		List<Role> tmpRole = queryByFieldAndValue(Role.COLUMN_NAME, role.getName());
		if (ListUtils.isNotEmpty(tmpRole)) {
			throw new BizfwServiceException(ErrorCode.Auth.Role.ADD_FAIL_EXISTED);
		}
		save(role);
	}

	@Transactional
	@Override
	public void modify(Role role) throws BizfwServiceException {
		List<Role> tmpRole = queryByFieldAndValue(Role.COLUMN_NAME, role.getName());
		if (ListUtils.isNotEmpty(tmpRole) && !role.getIdBfRole().equals(tmpRole.get(0).getIdBfRole())) {
			throw new BizfwServiceException(ErrorCode.Auth.Role.MOD_FAIL_EXISTED);
		}
		Role dbRole = queryById(role.getIdBfRole());
		dbRole.setName(role.getName());
		dbRole.setDescription(role.getDescription());
		dbRole.update(role.getUpdateBy());
		update(dbRole);
	}

	@Transactional
	@Override
	public void deleteRole(String roleId) throws BizfwServiceException {
		Role role = queryById(roleId);
		checkObjectNotNull(role, "角色[" + roleId + "]", "删除角色");
		checkRoleCanDelete(role);
		delete(role.getIdBfRole());
	}

	@Transactional
	@Override
	public void setRoleOfPeople(People people, List<String> roleIdList) throws BizfwServiceException {
		deletePeopleRoleRelation(people);
		for (String roleId : roleIdList) {
			Role role = queryById(roleId);
			if (role == null) {
				throw new BizfwServiceException(ErrorCode.PeopleDept.People.SET_ROLE_REL_FAIL_NOT_FOUND, roleId);
			}
			PeopleRoleRelation peopleRoleRelation = new PeopleRoleRelation(people.getUpdateBy(),
					people.getIdBfPeople(), roleId);
			peopleRoleRelDao.save(peopleRoleRelation);
		}
	}

	@Override
	public List<Role> getRoleListByPeople(String peopleId) throws BizfwServiceException {
		List<Role> roleList = new ArrayList<Role>();
		List<PeopleRoleRelation> relationList = peopleRoleRelDao.queryByFieldAndValue(
				PeopleRoleRelation.COLUMN_PEOPLE_ID, peopleId);
		for (PeopleRoleRelation relation : relationList) {
			Role role = queryById(relation.getRoleId());
			roleList.add(role);
		}
		return roleList;
	}

	@Override
	public long getPeopleCountByRole(Role role) throws BizfwServiceException {
		long count = peopleRoleRelDao.getCountByFieldAndValue(PeopleRoleRelation.COLUMN_ROLE_ID, role.getIdBfRole());
		return count;
	}

	private void deletePeopleRoleRelation(People people) throws BizfwServiceException {
		peopleRoleRelDao.deleteByFieldAndValue(PeopleRoleRelation.COLUMN_PEOPLE_ID, people.getIdBfPeople());
	}

	private void checkRoleCanDelete(Role role) throws BizfwServiceException {
		long peopleCount = getPeopleCountByRole(role);
		if (peopleCount > 0) {
			throw new BizfwServiceException(ErrorCode.Auth.Role.DEL_FAIL_WITH_PEOPLE);
		}
	}

	@Override
	public BaseDao<Role> getBaseDao() {
		return roleDao;
	}

}
