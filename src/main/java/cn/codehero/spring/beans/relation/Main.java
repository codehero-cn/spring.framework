package cn.codehero.spring.beans.relation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * 测试主程序.
 * @author eleven
 *
 */
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/relation/beans-relation.xml");
		
		//抽象bean不能被实例化
		//Address address=(Address) ctx.getBean("address");		
		//System.out.println(address);	
		
		Address address=(Address) ctx.getBean("address2");		
		System.out.println(address);
		
		address=(Address) ctx.getBean("address3");		
		System.out.println(address);		
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);

	}

}
