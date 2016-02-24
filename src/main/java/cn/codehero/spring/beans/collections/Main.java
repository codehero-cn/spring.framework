package cn.codehero.spring.beans.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.codehero.spring.beans.Person;
/**测试主程序.
 * @author eleven
 *
 */
public class Main {
	public static void  main(String[] args){
	//1.创建Spring的IOC容器对象
	ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/collections/spring-beans.xml"); 

	PersonList personlist = (PersonList) ctx.getBean("personList");
	System.out.println(personlist);
	
	PersonMap personmap = (PersonMap) ctx.getBean("personMap");
	System.out.println(personmap);	
	
	DataSource datasource = ctx.getBean(DataSource.class);
	System.out.println(datasource.getProperties());
	
	Person personlist2 = (Person) ctx.getBean("personList2");
	System.out.println(personlist2);
	}
}
