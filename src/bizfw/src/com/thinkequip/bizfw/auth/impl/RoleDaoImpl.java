package com.thinkequip.bizfw.auth.impl;

import org.springframework.stereotype.Repository;

import com.thinkequip.bizfw.auth.dao.RoleDao;
import com.thinkequip.bizfw.auth.model.Role;
import com.thinkequip.bizfw.base.impl.BaseDaoImpl;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {

}
