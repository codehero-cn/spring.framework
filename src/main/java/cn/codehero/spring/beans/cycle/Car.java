package cn.codehero.spring.beans.cycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *  类文件
 * @author eleven
 *
 */
public class Car implements BeanNameAware,BeanFactoryAware,
                            ApplicationContextAware,InitializingBean,DisposableBean{
	
	public Car(){
		System.out.println("Car's Constructor...");
	}
	
	private String brand;

	public void setBrand(String brand) {
		System.out.println("setBrand属性...");
		this.brand = brand;
	}
	
	//也可以用注解的方法来配置init-method
	//@PostConstruct
	public void init(){
		System.out.println("bean自己的init()方法，在bean配置文件中要配置");
	}
	
	//也可以用注解的方法来配置destory-method
	//@PreDestroy
	public void mydestroy(){
		System.out.println("mydestroy...");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}

	@Override
	//表示正在被实例化的bean的id是多少
	public void setBeanName(String name) {
		System.out.println("setBeanName方法被调用,值name是"+name);
	}

	@Override
	//可以传递beanFactory
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory方法被调用,beanFactory的值是"+beanFactory);
	}

	@Override
	//可以传递ApplicationContext
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("applicationContext方法被调用,applicationContext的值是"+applicationContext);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet方法被调用");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean的destory方法被调用");
	}
}
