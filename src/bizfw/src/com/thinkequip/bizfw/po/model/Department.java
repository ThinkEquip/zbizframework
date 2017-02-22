package com.thinkequip.bizfw.po.model;

import java.util.List;

import com.thinkequip.bizfw.base.model.BaseModel;

public class Department extends BaseModel {

	private static final long serialVersionUID = -8679405946033789045L;

	public static final String COLUMN_CODE = "code";

	public static final String COLUMN_PARENT_DEPT_ID = "parentDepartmentId";

	public static final int LEVEL_ROOT = 0;

	private String idBfDepartment;

	private String code;

	private String name;

	private int level;

	private String parentDepartmentId;

	private List<Department> childDepartmentList;

	public Department() {
		super();
	}

	public Department(String peopleCode) {
		super(peopleCode);
	}

	public String getIdBfDepartment() {
		return idBfDepartment;
	}

	public void setIdBfDepartment(String idBfDepartment) {
		this.idBfDepartment = idBfDepartment;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getParentDepartmentId() {
		return parentDepartmentId;
	}

	public void setParentDepartmentId(String parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

	public List<Department> getChildDepartmentList() {
		return childDepartmentList;
	}

	public void setChildDepartmentList(List<Department> childDepartmentList) {
		this.childDepartmentList = childDepartmentList;
	}
}
