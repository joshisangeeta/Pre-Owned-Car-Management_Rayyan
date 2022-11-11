package com.ava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarInfo {
	
	@Id
	@GeneratedValue
	@Column(name = "car_id")
	private int carId;
	
	@Column(name = "brand")
	private String brand;
	 
	@Column(name = "model") 
	private String model;

	@Column(name = "color")
	private String color;
	
	@Column(name = "no_of_years")
	private int no_of_years;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "booked")
	private String booked = "No";
	
	@OneToOne(mappedBy = "car")
	private Seller seller;
	
	public CarInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarInfo(int carId, String brand, String model, String color, int no_of_years, float price, String booked) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.no_of_years = no_of_years;
		this.price = price;
		this.booked = booked;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNo_of_years() {
		return no_of_years;
	}

	public void setNo_of_years(int no_of_years) {
		this.no_of_years = no_of_years;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBooked() {
		return booked;
	}

	public void setBooked(String booked) {
		this.booked = booked;
	}

	@Override
	public String toString() {
		return "CarInfo [carId=" + carId + ", brand=" + brand + ", model=" + model + ", sellerName=" 
				+ ", color=" + color + ", no_of_years=" + no_of_years + ", price=" + price + ", booked=" + booked + "]";
	}
	
	

	
	
	
	
	
	
	
	

}
