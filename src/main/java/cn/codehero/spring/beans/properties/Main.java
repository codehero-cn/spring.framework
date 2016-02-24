package cn.codehero.spring.beans.properties;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * 测试主程序.
 * 
 * @author eleven
 */
public class Main {

	public static void main(String[] args) throws SQLException  {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/cn/codehero/spring/beans/properties/beans-properties.xml");
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
}
