package cn.codehero.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/scope/beans-scope.xml");
		
		Car car =  (Car) ctx.getBean("car");
		Car car2 = (Car) ctx.getBean("car");
		
		System.out.println(car == car2);
	}

}
