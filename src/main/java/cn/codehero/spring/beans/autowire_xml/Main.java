package cn.codehero.spring.beans.autowire_xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**测试主程序.
 * @author eleven
 */
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/autowire/beans-autowire.xml");
		Person person =(Person) ctx.getBean("person");
		
		System.out.println(person);		

	}

}
