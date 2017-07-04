package cn.codehero.spring.beans.ioc;

public class Student {
	
	String name;
	
	public Student(){
		System.out.println("Stduent对象被创建了");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
