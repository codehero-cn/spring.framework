package cn.codehero.spring.beans.autowire;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Named("person")
public class Person {
	
	private String name;
	
	private Address address;
	
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Car getCar() {
		return car;
	}
	@Autowired
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car
				+ "]";
	}
	
}
