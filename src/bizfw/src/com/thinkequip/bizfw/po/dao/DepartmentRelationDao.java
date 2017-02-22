package com.thinkequip.bizfw.po.dao;

import java.util.List;

import com.thinkequip.bizfw.base.BaseDao;
import com.thinkequip.bizfw.po.model.Department;
import com.thinkequip.bizfw.po.model.DepartmentRelation;

public interface DepartmentRelationDao extends BaseDao<DepartmentRelation> {

	public DepartmentRelation getParentDepartmentRel(Department department);

	public List<DepartmentRelation> getChildDepartmentRelList(Department department);
}
