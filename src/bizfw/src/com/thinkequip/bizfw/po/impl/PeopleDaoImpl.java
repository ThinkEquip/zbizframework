package com.thinkequip.bizfw.po.impl;

import org.springframework.stereotype.Repository;

import com.thinkequip.bizfw.base.impl.BaseDaoImpl;
import com.thinkequip.bizfw.po.dao.PeopleDao;
import com.thinkequip.bizfw.po.model.People;

@Repository("peopleDao")
public class PeopleDaoImpl extends BaseDaoImpl<People> implements PeopleDao {

}
