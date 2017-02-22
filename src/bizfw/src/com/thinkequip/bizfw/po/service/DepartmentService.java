package com.thinkequip.bizfw.po.service;

import java.util.List;

import com.thinkequip.bizfw.base.BaseService;
import com.thinkequip.bizfw.base.BizfwServiceException;
import com.thinkequip.bizfw.po.model.Department;

public interface DepartmentService extends BaseService<Department> {

	public void addDepartment(Department department) throws BizfwServiceException;

	public void modifyDepartment(Department department) throws BizfwServiceException;

	public void deleteDepartment(Department department) throws BizfwServiceException;

	public void deleteUpperDepartmentRelation(Department department) throws BizfwServiceException;

	public Department queryByCode(String code) throws BizfwServiceException;

	public boolean hasChildDepartment(Department department) throws BizfwServiceException;

	public boolean hasPeople(Department department) throws BizfwServiceException;

	public Department getParentDepartment(Department department) throws BizfwServiceException;

	public List<Department> getChildDepartmentList(String deparmentId) throws BizfwServiceException;

	public List<Department> getAllParentDeptmentList(String deparmentId) throws BizfwServiceException;

	public List<Department> getAllChildDeptmentList(String deparmentId) throws BizfwServiceException;

	public Department getDepartmentTreeByDepartmentId(String deparmentId) throws BizfwServiceException;

}
