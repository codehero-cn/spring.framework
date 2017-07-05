package cn.codehero.spring.beans.cycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试主程序.
 * @author eleven
 */
public class Main {

	public static void main(String[] args) {
	    //ClassPathXmlApplicationContext的生命周期
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/cn/codehero/spring/beans/cycle/applicationContext.xml");
		Car car = (Car) ac.getBean("carid");
		System.out.println(car);
		//关闭IOC
		ac.close();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//BeanFactory生命周期
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("/cn/codehero/spring/beans/cycle/applicationContext.xml"));
		Car car1 = (Car) bf.getBean("carid");
		System.out.println(car);
		//关闭IOC
		//bf.close(); //BeanFactory没这个方法
		
		
	}
}
