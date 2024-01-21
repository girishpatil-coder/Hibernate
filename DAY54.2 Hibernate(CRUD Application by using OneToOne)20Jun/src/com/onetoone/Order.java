package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_mn")
public class Order {
	
	@Id
	private int orderId;
	private String product;
	private int cost;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + ", cost=" + cost + "]";
	}
	
	
	
	
	
	
}
