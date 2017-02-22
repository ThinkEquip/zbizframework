package com.thinkequip.bizfw.auth.service;

import java.util.List;

import com.thinkequip.bizfw.auth.model.Role;
import com.thinkequip.bizfw.base.BaseService;
import com.thinkequip.bizfw.base.BizfwServiceException;
import com.thinkequip.bizfw.po.model.People;

public interface RoleService extends BaseService<Role> {

	public List<Role> getRoleList() throws BizfwServiceException;

	public void addRole(Role role) throws BizfwServiceException;

	public void modify(Role role) throws BizfwServiceException;

	public void deleteRole(String roleId) throws BizfwServiceException;

	public List<Role> getRoleListByPeople(String peopleId) throws BizfwServiceException;

	public void setRoleOfPeople(People people, List<String> roleIdList) throws BizfwServiceException;

	public long getPeopleCountByRole(Role role) throws BizfwServiceException;

}
