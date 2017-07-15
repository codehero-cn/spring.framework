package cn.codehero.spring.beans.autowire;

import javax.inject.Named;

import org.springframework.stereotype.Component;
@Named("haval")
@Component
public class Haval implements Car{

	private String brand;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
	public void run(){
		System.out.println("I'm run");
	}

}
