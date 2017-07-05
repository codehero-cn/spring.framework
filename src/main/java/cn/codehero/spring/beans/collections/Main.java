package cn.codehero.spring.beans.collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**测试主程序
 * @author eleven
 *
 */
public class Main {
	public static void  main(String[] args){
	//1.创建Spring的IOC容器对象
	ApplicationContext ac = new ClassPathXmlApplicationContext("/cn/codehero/spring/beans/collections/applicationContext.xml"); 

	Person person = (Person) ac.getBean("personList");
	System.out.println(person.getName());
	//list装配数组
	System.out.println("+++++++++++++++List装配数组++++++++++++++++++++");
	for(String hobby:person.getHobby() ){
		System.out.println(hobby);
	}
	
	//List装配bean
	System.out.println("++++++++++++++ List装配bean++++++++++++++++++++++");
	for(Car cars:person.getCarsList() ){
		System.out.println(cars);
	}
	
	//Set装配
	System.out.println("++++++++++++++ Set装配++++++++++++++++++++++");
	for(Car car:person.getCarsSet()){
		System.out.println(car);
	}
	
	//Map装配
	System.out.println("++++++++++++++ Map装配++++++++++++++++++++++");
	//1.迭代器
	Map<String,Car> map = person.getCarsMap();
	Iterator it = map.keySet().iterator();
	while(it.hasNext()){
		String key =(String) it.next();
		Car car = map.get(key);
		System.out.println(key+"  "+car);
	}
	//2.简洁方法
	for(Entry<String,Car> e:person.getCarsMap().entrySet()){
		System.out.println(e.getKey()+","+e.getValue());
	}

	
	
	DataSource datasource = ac.getBean(DataSource.class);
	System.out.println(datasource.getProperties());
	
	
	Person personlist2 = (Person) ac.getBean("personList2");
	System.out.println(personlist2);
	}
}
