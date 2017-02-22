package com.thinkequip.bizfw.document.dao;

import java.util.List;

import com.thinkequip.bizfw.base.BaseDao;
import com.thinkequip.bizfw.document.model.Document;

public interface DocumentDao extends BaseDao<Document> {

	public long getChildCount(Document document);

	public List<Document> getAllFolder();

	public Document getRootFolder();

	public List<Document> getChildFolderList(Document document);

	public List<Document> getContentOfFolder(Document document);
}
