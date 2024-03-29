package com.onetoonee.bydirectionsecondlevelcach;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "OrderNew")
public class Order {

	@Id
	private int orderId;
	private String product;
	
	@Column(name = "cost")
	private int cast;
	
	@OneToOne(cascade = CascadeType.ALL /* ,mappedBy = "order" */)
	private Customer customer;

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

	public int getCast() {
		return cast;
	}

	public void setCast(int cast) {
		this.cast = cast;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
}
