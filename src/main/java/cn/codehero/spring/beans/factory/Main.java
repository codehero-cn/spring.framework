package cn.codehero.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试主程序.
 * 
 * @author eleven
 */
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/factory/beans-factory.xml");

		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);

		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
	}

}
