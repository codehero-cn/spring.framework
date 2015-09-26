package cn.codehero.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void  main(String[] args){
	//1.创建Spring的IOC容器对象		
	//ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");   //找不到文件
	ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/spring-beans.xml"); 
	
	//2.从ICO容器中获取Bean实例
	//利用类型返回IOC容器中的Bean,但要求ICO容器中必须只能有一个 该类型的Bean,有重复名字时会报错，不常用
	//HelloWorld helloWorld = ctx.getBean(HelloWorld.class); 
	
	//利用id定位到IOC容器中的bean
	System.out.println("以下是HelloWorld实验");
	HelloWorld helloworld = (HelloWorld) ctx.getBean("helloWorld");	
	System.out.println(helloworld);  //可以看到打印出来的是一个对象	
	//3.调用hello方法
	helloworld.hello();	
	System.out.println("");
	
	System.out.println("以下是Car类bean实验");	
	Car car = (Car) ctx.getBean("car1");
	System.out.println(car);
	
	car = (Car) ctx.getBean("car2");
	System.out.println(car);
	System.out.println("");
	
	System.out.println("以下是Person类bean实验");
	Person person = (Person) ctx.getBean("person1");
	System.out.println(person);
	
	person = (Person) ctx.getBean("person2");
	System.out.println(person);
	}
}
