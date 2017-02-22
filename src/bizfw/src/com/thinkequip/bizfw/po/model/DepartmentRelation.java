package com.thinkequip.bizfw.po.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class DepartmentRelation extends BaseModel {

	private static final long serialVersionUID = -4315263369289046960L;

	public static final String COLUMN_PARENT_DEPARTMENT_ID = "parentDepartmentId";

	public static final String COLUMN_CHILD_DEPARTMENT_ID = "childDepartmentId";

	public static final String COLUMN_PARENT_LEVEL = "parentLevel";

	private String idBfDepartmentRel;

	private String parentDepartmentId;

	private String childDepartmentId;

	private int parentLevel;

	public DepartmentRelation(String peopleCode) {
		super(peopleCode);
	}

	public DepartmentRelation() {
		super();
	}

	public String getIdBfDepartmentRel() {
		return idBfDepartmentRel;
	}

	public void setIdBfDepartmentRel(String idBfDepartmentRel) {
		this.idBfDepartmentRel = idBfDepartmentRel;
	}

	public String getParentDepartmentId() {
		return parentDepartmentId;
	}

	public void setParentDepartmentId(String parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

	public String getChildDepartmentId() {
		return childDepartmentId;
	}

	public void setChildDepartmentId(String childDepartmentId) {
		this.childDepartmentId = childDepartmentId;
	}

	public int getParentLevel() {
		return parentLevel;
	}

	public void setParentLevel(int parentLevel) {
		this.parentLevel = parentLevel;
	}

}
