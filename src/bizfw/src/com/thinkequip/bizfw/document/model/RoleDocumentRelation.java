package com.thinkequip.bizfw.document.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class RoleDocumentRelation extends BaseModel {

	private static final long serialVersionUID = 3122928795008437565L;

	public static final String COLUMN_ROLE_ID = "idBfRole";

	public static final String COLUMN_DOCUMENT_ID = "idBfDocument";

	public static final String COLUMN_AUTH = "auth";

	private String idBfRoleDocumentRel;

	private String idBfRole;

	private String idBfDocument;

	private String auth;

	public RoleDocumentRelation() {
		super();
	}

	public RoleDocumentRelation(String peopleCode) {
		super(peopleCode);
	}

	public RoleDocumentRelation(String peopleCode, String roleId, String documentId) {
		super(peopleCode);
		this.idBfRole = roleId;
		this.idBfDocument = documentId;
	}

	public String getIdBfRoleDocumentRel() {
		return idBfRoleDocumentRel;
	}

	public void setIdBfRoleDocumentRel(String idBfRoleDocumentRel) {
		this.idBfRoleDocumentRel = idBfRoleDocumentRel;
	}

	public String getIdBfRole() {
		return idBfRole;
	}

	public void setIdBfRole(String idBfRole) {
		this.idBfRole = idBfRole;
	}

	public String getIdBfDocument() {
		return idBfDocument;
	}

	public void setIdBfDocument(String idBfDocument) {
		this.idBfDocument = idBfDocument;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

}
