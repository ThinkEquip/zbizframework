package com.thinkequip.bizfw.document.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class DocumentOperationLog extends BaseModel {

	private static final long serialVersionUID = -4481884134578804202L;

	public static final String OPT_ADD = "1";

	public static final String OPT_MOD = "2";

	public static final String OPT_DEL = "3";

	public static final String OPT_UPD = "4";
	
	public static final String OPT_DOWNLOAD = "5";

	private String idBfDocumentOptLog;

	private String operation;

	private String targetType;

	private String targetId;

	private String targetName;

	public DocumentOperationLog(String peopleCode) {
		super(peopleCode);
	}

	public String getIdBfDocumentOptLog() {
		return idBfDocumentOptLog;
	}

	public void setIdBfDocumentOptLog(String idBfDocumentOptLog) {
		this.idBfDocumentOptLog = idBfDocumentOptLog;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
}
