package cn.codehero.spring.beans.autowire;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
public class MainTest {
	@Inject Person person;
	//@Inject Ford ford;
	@Inject Haval haval;
	@Test
	public void test(){
		System.out.println("hello");
		//ford.setBrand("ford");
		haval.setBrand("haval");
		System.out.println(person);
		
	}
}
