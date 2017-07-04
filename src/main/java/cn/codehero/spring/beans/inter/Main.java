package cn.codehero.spring.beans.inter;

import org.springframework.context.ApplicationContext;

import cn.codehero.spring.beans.util.ApplicationContextUtil;

public class Main {
	public   static void main(String[] args){
		
		String acXmlPath = "cn/codehero/spring/beans/inter/applicationContext.xml";
		ApplicationContext ac = ApplicationContextUtil.getApplicstionContext(acXmlPath);
		
		ChangeLetter cl = (ChangeLetter) ac.getBean("changeLetter");
		System.out.println(cl.change());
	}
}
