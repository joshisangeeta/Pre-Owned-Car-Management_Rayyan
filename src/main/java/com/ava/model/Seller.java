package com.ava.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Seller {
	
	@Id
	@GeneratedValue
	@Column(name="sellerId")
	private int sellerId;
	
	@Column(name = "sellerName")
	private String sellerName;
	 
	@Column(name = "sellerEmail") 
	private String sellerEmail;
		
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "car_id", nullable = false)	
	private CarInfo car;

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(int sellerId, String sellerName, String sellerEmail, CarInfo car) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.car = car;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public CarInfo getCar() {
		return car;
	}

	public void setCar(CarInfo car) {
		this.car = car;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail + ", car="
				+ car + "]";
	}

    
	
	
	


	
	

}
