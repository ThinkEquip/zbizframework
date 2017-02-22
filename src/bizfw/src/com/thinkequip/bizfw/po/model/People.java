package com.thinkequip.bizfw.po.model;

import com.thinkequip.bizfw.base.common.PropertiesUtils;
import com.thinkequip.bizfw.base.common.SystemUtils;
import com.thinkequip.bizfw.base.model.BaseModel;

/**
 * 创建于:2016-2-22<br>
 * 版权所有(C) 2016 深圳市银之杰科技股份有限公司<br>
 * 人员信息模型
 * 
 * @author 曾永理
 * @version 1.0
 */
public class People extends BaseModel {

	private static final long serialVersionUID = -9173667783512729829L;

	public static final String COLUMN_CODE = "code";

	public static final String COLUMN_DEPARTMENT_ID = "departmentId";

	public static final String STATUS_INVALID = "0";

	public static final String STATUS_NORMAL = "1";

	public static final String STATUS_LOCKED = "2";

	public static final String STATUS_UNCHECK = "3";

	/** 主键 */
	private String idBfPeople;

	/** 用户名 */
	private String code;

	/** 用户姓名 */
	private String name;

	/** 密码 */
	private String password;

	/** 机构id */
	private String departmentId;

	/** 状态 */
	private String status;

	/** 密码错误次数 */
	private int errorCount;

	public People() {
		super();
	}

	public People(String peopleCode) {
		super(peopleCode);
		this.errorCount = 0;
		this.status = STATUS_NORMAL;
		this.password = SystemUtils.encryptMD5(PropertiesUtils.getSysConfig("default.pwd"));
	}

	public String getIdBfPeople() {
		return idBfPeople;
	}

	public void setIdBfPeople(String idBfPeople) {
		this.idBfPeople = idBfPeople;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
