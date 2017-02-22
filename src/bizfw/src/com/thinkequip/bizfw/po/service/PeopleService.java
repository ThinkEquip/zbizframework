package com.thinkequip.bizfw.po.service;

import java.util.List;

import com.thinkequip.bizfw.base.BaseService;
import com.thinkequip.bizfw.base.BizfwServiceException;
import com.thinkequip.bizfw.po.model.Department;
import com.thinkequip.bizfw.po.model.People;

public interface PeopleService extends BaseService<People> {

	public String addPeople(People people) throws BizfwServiceException;

	public void modifyPeople(People people) throws BizfwServiceException;

	public void deletePeople(People people) throws BizfwServiceException;

	public People getByCode(String code) throws BizfwServiceException;

	public long getPeopleCountByDepartment(Department department) throws BizfwServiceException;

	public List<People> getPeopleListByDepartment(String departmentId) throws BizfwServiceException;

	public void unlock(People people) throws BizfwServiceException;

	public void modifyPassword(People people, String oldPwd, String newPwd) throws BizfwServiceException;
}
