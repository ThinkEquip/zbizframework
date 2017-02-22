package com.thinkequip.bizfw.base.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 基础模型类
 * 
 * @author zengyongli
 * @date 2016年9月13日
 */
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 2305562441218971838L;

	/** 记录创建时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createDate;

	/** 记录创建人员 */
	private String createBy;

	/** 记录修改时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateDate;

	/** 记录修改人员 */
	private String updateBy;

	public BaseModel(String peopleCode) {
		this.createDate = new Date();
		this.updateDate = new Date();
		this.createBy = peopleCode;
		this.updateBy = peopleCode;
	}

	public BaseModel() {
	}

	public void init(String peopleCode) {
		this.createDate = new Date();
		this.updateDate = new Date();
		this.createBy = peopleCode;
		this.updateBy = peopleCode;
	}

	public void update(String peopleCode) {
		this.updateDate = new Date();
		this.updateBy = peopleCode;
	}

	public void update() {
		this.updateDate = new Date();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
}
