package com.thinkequip.bizfw.auth.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class PeopleRoleRelation extends BaseModel {

	private static final long serialVersionUID = -5402400327267119179L;

	public static final String COLUMN_PEOPLE_ID = "peopleId";

	public static final String COLUMN_ROLE_ID = "roleId";

	private String idBfPeopleRoleRel;

	private String peopleId;

	private String roleId;

	public PeopleRoleRelation(String peopleCode, String peopleId, String roleId) {
		super(peopleCode);
		this.peopleId = peopleId;
		this.roleId = roleId;
	}

	public PeopleRoleRelation() {
		super();
	}

	public String getIdBfPeopleRoleRel() {
		return idBfPeopleRoleRel;
	}

	public void setIdBfPeopleRoleRel(String idBfPeopleRoleRel) {
		this.idBfPeopleRoleRel = idBfPeopleRoleRel;
	}

	public String getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
