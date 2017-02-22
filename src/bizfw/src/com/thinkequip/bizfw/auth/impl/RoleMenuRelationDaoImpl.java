package com.thinkequip.bizfw.auth.impl;

import org.springframework.stereotype.Repository;

import com.thinkequip.bizfw.auth.dao.RoleMenuRelationDao;
import com.thinkequip.bizfw.auth.model.RoleMenuRelation;
import com.thinkequip.bizfw.base.impl.BaseDaoImpl;

@Repository("roleMenuRelationDao")
public class RoleMenuRelationDaoImpl extends BaseDaoImpl<RoleMenuRelation> implements RoleMenuRelationDao {

}
