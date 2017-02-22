package com.thinkequip.bizfw.document.service;

import com.thinkequip.bizfw.base.BaseService;
import com.thinkequip.bizfw.document.model.Document;
import com.thinkequip.bizfw.document.model.DocumentOperationLog;

public interface DocumentOptLogService extends BaseService<DocumentOperationLog> {

	public void addLog(Document document, String operation);
}
