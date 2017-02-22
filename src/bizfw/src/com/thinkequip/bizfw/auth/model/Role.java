package com.thinkequip.bizfw.auth.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class Role extends BaseModel {

	private static final long serialVersionUID = -8526551139465233349L;

	public static final String COLUMN_NAME = "name";

	private String idBfRole;

	private String name;

	private String description;

	public Role(String peopleCode, String name, String desc) {
		super(peopleCode);
		this.name = name;
		this.description = desc;
	}

	public Role() {
		super();
	}

	public String getIdBfRole() {
		return idBfRole;
	}

	public void setIdBfRole(String idBfRole) {
		this.idBfRole = idBfRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
