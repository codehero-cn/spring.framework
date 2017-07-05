package cn.codehero.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization方法被调用:"+ bean + ","+ beanName);
		System.out.println(bean+"被创建的时间是："+new java.util.Date());
		//进行过滤
		if("car".equals(beanName)){
			//...
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization方法被调用:"+ bean + ","+ beanName);
		
		//可以进行偷梁换柱
		Car car = new Car();
		car.setBrand("Ford");
		return car;
	}
}
