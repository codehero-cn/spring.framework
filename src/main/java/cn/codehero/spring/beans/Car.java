package cn.codehero.spring.beans;
/**
 * 构造器注入                  |51CTO：Spring4.0从入门到精通视频教程:3.Spring_配置Bean 
 * @author eleven
 *
 */
public class Car {
	private String brand;
	private String crop;
	private double price;
	private int maxSpeed;
	
	public Car(String brand, String crop, double price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}
	public Car(String brand, String crop, int maxSpeed) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price
				+ ", maxSpeed=" + maxSpeed + "]";
	}

}
