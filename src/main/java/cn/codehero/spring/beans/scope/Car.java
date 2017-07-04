package cn.codehero.spring.beans.scope;
/**
 * 实验用类文件
 * @author eleven
 *
 */
public class Car {

	private String brand;
	private double price;

	public Car(){
		System.out.println("Car's Constructor...");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	

}
