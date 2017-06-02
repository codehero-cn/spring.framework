package cn.codehero.spring.beans.collections;
import java.util.List;

import cn.codehero.spring.beans.Car;
/**
 * 集合属性List,       51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  
 */
public class PersonList {
	private String name;
	private int age;	
	
	private List<Car> cars;

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
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "PersonList [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

	
}
