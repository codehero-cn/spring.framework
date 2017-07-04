package cn.codehero.spring.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试主程序.
 * 
 * @author eleven
 */
public class Main {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/cycle/applicationContext.xml");
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		//关闭IOC
		ctx.close();
	}

}
