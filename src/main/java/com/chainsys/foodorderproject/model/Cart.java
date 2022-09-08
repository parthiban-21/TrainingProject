package com.chainsys.foodorderproject.model;

import org.springframework.stereotype.Repository;

@Repository
public class Cart {
	private int userID;
	private int itemID;
	private String itemName;
	private int quantity;
	private String orderType;
	private String orderStatus;
	private float unitPrice;
	private float totalPrice;
	private String orderID;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	@Override
	public String toString() {
		return "Cart [userID=" + userID + ", menuID=" + itemID + ", menuName=" + itemName + ", quantity=" + quantity
				+ ", orderType=" + orderType + ", orderStatus=" + orderStatus + ", perPrice=" + unitPrice
				+ ", totalPrice=" + totalPrice + ", orderID=" + orderID + "]";
	}
}
