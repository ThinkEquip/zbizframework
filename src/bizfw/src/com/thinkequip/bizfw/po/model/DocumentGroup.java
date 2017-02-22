package com.thinkequip.bizfw.po.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class DocumentGroup extends BaseModel{

	private static final long serialVersionUID = 8184577330523035232L;

	private String idBfDocumentGroup;

	private String documentId;

	public DocumentGroup() {
		super();
	}

	public String getIdBfDocumentGroup() {
		return idBfDocumentGroup;
	}

	public void setIdBfDocumentGroup(String idBfDocumentGroup) {
		this.idBfDocumentGroup = idBfDocumentGroup;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

}
