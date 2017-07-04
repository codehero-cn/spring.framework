package cn.codehero.spring.beans.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * ApplicationContext容器单例模式
 * @author eleven
 */
final public class ApplicationContextUtil {
	
	private static ApplicationContext ac = null;
	
	private ApplicationContextUtil(){
		
	}
	
	public static ApplicationContext getApplicstionContext(String str){
		if(ac ==  null){
			ac =new ClassPathXmlApplicationContext(str); 
		}
		return ac;
	}
	
			
}
