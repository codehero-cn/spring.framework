package cn.codehero.spring.beans.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		//1.使用ApplicationContext容器,加载xml文件中配置的bean被实例化(如果该bean的scope是singleton)。
		//类路径下使用这个
		ApplicationContext ac = new ClassPathXmlApplicationContext("/cn/codehero/spring/beans/ioc/applicationContext.xml");
		//文件路径下时用这个,不可以使用相对路径
		//ApplicationContext ac = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/applicationContext.xml"); 

		//注释掉可以实验ApplicationContext加载xml后是否已经实例化bean，,构造函数中有输出
		//Student st = (Student) ac.getBean("student");
		//System.out.print(st.getName());
		
		//2.使用BeanFactory容器,加载xml文件时其中的bean还没有被实例化
		BeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("cn/codehero/spring/beans/ioc/applicationContext.xml"));
		
		//注释掉可以实验BeanFactory加载xml后是否已经实例化bean,构造函数中有输出
		//Student st1 = (Student) bf.getBean("student");
		//System.out.print(st.getName());
		
		
	}

}
