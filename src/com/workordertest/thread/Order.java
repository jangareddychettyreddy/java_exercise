package com.workordertest.thread;

public class Order {
	
	String stateField;
	Integer orderId;
	
	public Order () {
	}
	public Order(String stateField, Integer orderId) {
		super();
		this.stateField = stateField;
		this.orderId = orderId;
	}
	public String getStateField() {
		return stateField;
	}
	public void setStateField(String stateField) {
		this.stateField = stateField;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
