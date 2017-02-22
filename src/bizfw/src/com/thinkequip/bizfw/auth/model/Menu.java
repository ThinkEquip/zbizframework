package com.thinkequip.bizfw.auth.model;

import java.util.List;

import com.thinkequip.bizfw.base.model.BaseModel;

public class Menu extends BaseModel {

	private static final long serialVersionUID = 8163772024398615538L;

	public static final String ROOT_NAME = "root";

	public static final String COLUMN_NAME = "name";

	public static final String COLUMN_PARENT_MENU_ID = "parentMenuId";

	public static final String COLUMN_ORDERS = "orders";

	private String idBfMenu;

	private String name;

	private String url;

	private String orders;

	private String parentMenuId;

	private List<Menu> childList;

	public Menu(String peopleCode, String name, String url, String orders, String parentMenuId) {
		super(peopleCode);
		this.name = name;
		this.url = url;
		this.orders = orders;
		this.parentMenuId = parentMenuId;
	}

	public Menu() {
		super();
	}

	public String getIdBfMenu() {
		return idBfMenu;
	}

	public void setIdBfMenu(String idBfMenu) {
		this.idBfMenu = idBfMenu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOrders() {
		return orders;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public String getParentMenuId() {
		return parentMenuId;
	}

	public void setParentMenuId(String parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

	public List<Menu> getChildList() {
		return childList;
	}

	public void setChildList(List<Menu> childList) {
		this.childList = childList;
	}

}
