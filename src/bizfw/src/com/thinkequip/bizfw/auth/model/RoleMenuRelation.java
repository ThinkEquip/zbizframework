package com.thinkequip.bizfw.auth.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class RoleMenuRelation extends BaseModel {

	private static final long serialVersionUID = -4727978116878032279L;

	public static final String COLUMN_ROLE_ID = "roleId";

	public static final String COLUMN_MENU_ID = "menuId";

	private String idBfRoleMenuRel;

	private String roleId;

	private String menuId;

	public RoleMenuRelation(String peopleCode, String roleId, String menuId) {
		super(peopleCode);
		this.roleId = roleId;
		this.menuId = menuId;
	}

	public RoleMenuRelation() {
		super();
	}

	public String getIdBfRoleMenuRel() {
		return idBfRoleMenuRel;
	}

	public void setIdBfRoleMenuRel(String idBfRoleMenuRel) {
		this.idBfRoleMenuRel = idBfRoleMenuRel;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

}
