package com.thinkequip.bizfw.po.impl;

import org.springframework.stereotype.Repository;

import com.thinkequip.bizfw.base.impl.BaseDaoImpl;
import com.thinkequip.bizfw.po.dao.DepartmentDao;
import com.thinkequip.bizfw.po.model.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao {

}
