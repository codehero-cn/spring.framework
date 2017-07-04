package cn.codehero.spring.beans.scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试主程序.
 * @author eleven
 *
 */

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("/cn/codehero/spring/beans/scope/applicationContext.xml");
		
		//singleton实验
		Car car1 = (Car) ac.getBean("car");
		Car car2 = (Car) ac.getBean("car");
		//可以看到打印出来的是同一个对象,默认是singleton单例
		System.out.println(car1 + "    "+car2);  
		
		//prototype实验
		Car car3 =  (Car) ac.getBean("carPrototype");
		Car car4 = (Car) ac.getBean("carPrototype");
		//可以看到打印出来的不是同一个对象
		System.out.println(car3+"      "+car4+"   "+(car3 == car4));
	}

}


