package cn.codehero.spring.beans.collections;
import java.util.Properties;
/**
 * getProperties使用 ,51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  
 */
public class DataSource {
	private Properties properties;
	
	public Properties getProperties(){
		return properties;
	}
	
	public void setProperties(Properties properties){
		this.properties = properties;
	}
	
	public String toString(){
		return "DataSource [properties=" + properties + "]";
	}
	
}
