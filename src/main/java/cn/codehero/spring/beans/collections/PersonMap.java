package cn.codehero.spring.beans.collections;

import java.util.List;
import java.util.Map;

import cn.codehero.spring.beans.Car;
/**
 * 集合属性Map,51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  
 */
public class PersonMap {
	private String name;
	private int age;	
	
	private Map<String,Car> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Car> getCars() {
		return cars;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "PersonMap [name=" + name + ", age=" + age + ", cars=" + cars
				+ "]";
	}
	
	
	
}
