package com.thinkequip.bizfw.document.model;

import com.thinkequip.bizfw.base.model.BaseModel;

public class FileDeleted extends BaseModel {

	private static final long serialVersionUID = -2647860587859869302L;

	private String idBfFileDeleted;

	private String url;

	public FileDeleted(String peopleCode) {
		super(peopleCode);
	}

	public FileDeleted(String peopleCode, String url) {
		super(peopleCode);
		this.url = url;
	}

	public String getIdBfFileDeleted() {
		return idBfFileDeleted;
	}

	public void setIdBfFileDeleted(String idBfFileDeleted) {
		this.idBfFileDeleted = idBfFileDeleted;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
