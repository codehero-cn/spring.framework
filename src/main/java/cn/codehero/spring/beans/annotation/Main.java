package cn.codehero.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.codehero.spring.beans.annotation.controller.UserController;
import cn.codehero.spring.beans.annotation.repository.UserRepository;
import cn.codehero.spring.beans.annotation.service.UserService;

public class Main {
	public static void main(String[] args){
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/annotation/beans-annotation.xml");
	
		TestObject to = (TestObject) ctx.getBean("testObject");
		System.out.println(to);
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);

		UserService userService = (UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);
	}
}
