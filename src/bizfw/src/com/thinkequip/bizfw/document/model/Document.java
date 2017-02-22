package com.thinkequip.bizfw.document.model;

import java.util.List;

import com.thinkequip.bizfw.base.model.BaseModel;

/**
 * 文件存储模型
 * 
 * @author zengyongli
 * @date 2016年10月19日
 */
public class Document extends BaseModel {

	private static final long serialVersionUID = -7390005208539497792L;

	public static final String TYPE_DIRECTORY = "0";

	public static final String TYPE_FILE = "1";

	public static final String ROOT_NAME = "/";

	public static final int REVISION_FIRST = 1;

	public static final String COLUMN_NAME = "name";

	public static final String COLUMN_TYPE = "type";

	public static final String COLUMN_OWNER_DOCUMENT_ID = "ownerDocumentId";

	public static final String COLUMN_REVISION = "revision";

	private String idBfDocument;

	private String name;

	private String extension;

	private String type;

	private String path;

	private String url;
	
	private Long size;

	private String memo;

	private String ownerDocumentId;

	private Integer revision;

	private Integer downloadCount;

	private String md5;

	private List<Document> childList;

	public Document() {
		super();
	}

	public Document(String peopleCode) {
		super(peopleCode);
	}

	public String getIdBfDocument() {
		return idBfDocument;
	}

	public void setIdBfDocument(String idBfDocument) {
		this.idBfDocument = idBfDocument;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOwnerDocumentId() {
		return ownerDocumentId;
	}

	public void setOwnerDocumentId(String ownerDocumentId) {
		this.ownerDocumentId = ownerDocumentId;
	}

	public Integer getRevision() {
		return revision;
	}

	public void setRevision(Integer revision) {
		this.revision = revision;
	}

	public Integer getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(Integer downloadCount) {
		this.downloadCount = downloadCount;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public List<Document> getChildList() {
		return childList;
	}

	public void setChildList(List<Document> childList) {
		this.childList = childList;
	}

}
