package cn.codehero.spring.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.codehero.spring.beans.util.ApplicationContextUtil;
/**测试主程序.
 * @author eleven
 */

public class Main {
	public static void  main(String[] args){
	//1.创建Spring的IOC容器对象
	String acXmlPath = "cn/codehero/spring/beans/inter/applicationContext.xml";
	ApplicationContext ac = ApplicationContextUtil.getApplicstionContext(acXmlPath);	
		
	//2.从ICO容器中获取Bean:HelloWorld实例
	//利用类型返回IOC容器中的Bean,但要求ICO容器中必须只能有一个 该类型的Bean,有重复名字时会报错，不常用   
	//HelloWorld helloWorld = ac.getBean(HelloWorld.class); 	
	
	//利用id定位到IOC容器中的bean：helloworld   
	System.out.println("以下是HelloWorld实验");
	HelloWorld helloworld = (HelloWorld) ac.getBean("hello_id");	
	//调用hello方法 
	helloworld.hello();	
	System.out.println("");

	System.out.println("以下是Car类bean实验");	
	Car car = (Car) ac.getBean("car1");
	System.out.println(car);
	
	car = (Car) ac.getBean("car2");
	System.out.println(car);
	System.out.println("");
	
	System.out.println("以下是Person类bean实验");
	Person person = (Person) ac.getBean("person1");
	System.out.println(person);
	
	person = (Person) ac.getBean("person2");
	System.out.println(person);
	}
}
