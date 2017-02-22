package com.thinkequip.bizfw.document.service;

import java.util.List;

import com.thinkequip.bizfw.auth.model.Role;
import com.thinkequip.bizfw.base.BaseService;
import com.thinkequip.bizfw.base.BizfwServiceException;
import com.thinkequip.bizfw.document.model.Document;
import com.thinkequip.bizfw.document.model.RoleDocumentRelation;
import com.thinkequip.bizfw.po.model.People;

public interface DocumentService extends BaseService<Document> {

	public Document getAllFolderTree() throws BizfwServiceException;

	public Document getAuthFolderTree(People people) throws BizfwServiceException;

	public List<Document> getFolderOfRole(Role role) throws BizfwServiceException;

	public List<Role> getRoleOfFolder(Document folder) throws BizfwServiceException;

	public String addFolder(Document document) throws BizfwServiceException;

	public void modifyFolder(Document document) throws BizfwServiceException;

	public void deleteFolder(String documentId) throws BizfwServiceException;

	public void setFolderOfRole(Role role, List<String> folderIdList) throws BizfwServiceException;

	public void setRoleOfFolder(Document folder, List<String> roleIdList) throws BizfwServiceException;

	public RoleDocumentRelation getRelationById(String relationId) throws BizfwServiceException;

	public void modifyRelation(RoleDocumentRelation relation) throws BizfwServiceException;

	public String addFile(Document document) throws BizfwServiceException;

	public void modifyFile(Document document) throws BizfwServiceException;

	public String updateFile(Document document) throws BizfwServiceException;

	public void downloadFile(Document document) throws BizfwServiceException;

	public void deleteFile(Document document) throws BizfwServiceException;

	public List<Document> getHistoryFileList(Document document) throws BizfwServiceException;

	public List<Document> getContentOfFolder(Document document) throws BizfwServiceException;

}
