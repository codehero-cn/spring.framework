package cn.codehero.spring.beans;
/**
 * 属性注入        
 */
public class HelloWorld {
	private String name;
	
	public HelloWorld(){
		System.out.println("HelloWorld's Constructor...");
	}
	
	public void setName2(String name){
		System.out.println("setName:" + name);
		this.name=name;		
	}

	public void hello(){
		System.out.println("hello:" + name);
	}
}
