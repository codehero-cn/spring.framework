package cn.codehero.spring.beans.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试主程序.
 * @author eleven
 */
public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/cn/codehero/spring/beans/cycle/applicationContext.xml");
		
		Car car = (Car) ac.getBean("car");
		System.out.println(car);
		
		//关闭IOC
		ac.close();
	}

}
