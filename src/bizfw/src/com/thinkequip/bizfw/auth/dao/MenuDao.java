package com.thinkequip.bizfw.auth.dao;

import com.thinkequip.bizfw.auth.model.Menu;
import com.thinkequip.bizfw.base.BaseDao;
import com.thinkequip.bizfw.base.BizfwServiceException;

public interface MenuDao extends BaseDao<Menu> {

	public Menu getRootMenu() throws BizfwServiceException;

}
