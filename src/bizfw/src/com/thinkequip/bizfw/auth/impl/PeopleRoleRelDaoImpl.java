package com.thinkequip.bizfw.auth.impl;

import org.springframework.stereotype.Repository;

import com.thinkequip.bizfw.auth.dao.PeopleRoleRelDao;
import com.thinkequip.bizfw.auth.model.PeopleRoleRelation;
import com.thinkequip.bizfw.base.impl.BaseDaoImpl;

@Repository("peopleRoleRelDao")
public class PeopleRoleRelDaoImpl extends BaseDaoImpl<PeopleRoleRelation> implements PeopleRoleRelDao {

}
