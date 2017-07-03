package cn.codehero.spring.beans.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 工具类把ApplicationContext做成一个单例
 * @author eleven
 *
 */
final public class ApplicationContextUtil {
	
	private static ApplicationContext ac = null;
	
	private ApplicationContextUtil(){
		
	}
	static {
		ac = new ClassPathXmlApplicationContext("cn/codehero/spring/beans/applicationContext.xml");
		
	}
	public static ApplicationContext getApplicstionContext(){
		return ac;
	}
	
			
}
