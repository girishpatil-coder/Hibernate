package com.cjc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Student_Address") //change table name
public class Address {

	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment value in adrressId
	@Column(name = "address_id") //column name changed.
	private int addressId;
	
	@Column(length = 50,name = "STREET") //column length and name are changed
	private String street;
	
	@Column(name = "CITY",length = 50) //column length and name are changed
	private String  city;
	
	@Column(name ="Is_Open") //column name changed
	private boolean isOpen;
	
	@Transient //this column is not create.
	private double x;
	
	@Column(name = "Added_Date")//column name changed
	@Temporal(TemporalType.DATE) //only use date not time.
	private Date addedDate;
	
	@Lob //image is large object.(@Lob is use large object)
	private byte[] image;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	

	
	
}
