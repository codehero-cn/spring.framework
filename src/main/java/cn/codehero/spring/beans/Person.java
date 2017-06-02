package cn.codehero.spring.beans;
/**
 * |   引用其他bean,内部bean |51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节
 * @author eleven
 *
 */
public class Person {
	private String name;
	private int age;	
	private Car car;

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

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	

	public Person() {
		
	}
	
	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "PersonList [name=" + name + ", age=" + age + ", car=" + car + "]";
	}	
}
