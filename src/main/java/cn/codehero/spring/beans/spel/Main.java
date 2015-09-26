package cn.codehero.spring.beans.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/spel/beans-spel.xml");
		
		Address address = (Address) ctx.getBean("address");
		System.out.println(address);		

		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}

}
