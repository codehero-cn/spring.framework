##项目介绍:实验spring_framework

##配置:
eclipse4.4.2 build使用gradle2.10

##使用:
各模块包里找到Main.java文件，而后Run As->Java Application,在Console里观察实验结果.

##内容
1. 51CTO：Spring4.0从入门到精通视频教程	  作者：佟刚

##包结构和功能如下:
###1 cn.codehero.spring.beans  声明bean、构造器注入、属性注入、引用其他bean
配置文件:src/main/java/config/spring-beans.xml	
|源文件|功能|内容
|---|---|---|  
|Main.java ：             |本包测试主程序	通用部份  
|HelloWorld.java  	|属性注入					|51CTO：Spring4.0从入门到精通视频教程:1.Spring_HelloWorld  
|Car.java			|构造器注入				    |51CTO：Spring4.0从入门到精通视频教程:3.Spring_配置Bean  
|Person.java		|	引用其他bean,内部bean	|51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  

###2 cn.codehero.spring.beans.collections 集合属性配置细节：list,map    
|源文件|功能|内容
|---|---|---|  
|Main.java：   		|本包测试主程序		|51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  
|PersonList.java	|集合属性List		|51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  
|PersonMap.java		|集合属性Map			|51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  
|DataSource.java	|getProperties使用	|51CTO：Spring4.0从入门到精通视频教程:4.Spring_属性配置细节  
                            
###3 cn.codehero.spring.beans.autowire 自动装配  
内容：51CTO：Spring4.0从入门到精通视频教程  5.Spring_自动装配  
源文件---功能---内容  
beans-autowire.xml	配置文件  	
Main.java	主程序	
Address.java 类文件  
Car.java  
Person.java  		

###4 cn.codehero.spring.beans.relation  bean配置之间的关系：继承和依赖  
内容：51CTO：Spring4.0从入门到精通视频教程 6.Spring_Bean之间的关系  
源文件---功能---内容  
beans-relation.xml	配置文件  	
Main.java			主程序	
Address.java 		 类文件	
Car.java  
Person.java  	

###5 cn.codehero.spring.beans.scope  bean的作用域  
内容：51CTO：Spring4.0从入门到精通视频教程 7.Spring_Bean的作用域  
源文件---功能---内容  
beans-scope.xml	配置文件  	
Main.java	主程序	
Car.java	类文件	

###6 cn.codehero.spring.beans.properties 使用外部属性文件c3p0连接数据库  
内容：51CTO：Spring4.0从入门到精通视频教程 8.Spring_使用外部属性文件  
源文件---功能---内容  
beans-properties.xml	配置文件  	
Main.java	  			主程序	
db.properties			外部属性文件  	

###7 cn.codehero.spring.beans.spel  spel的用法  
内容：51CTO：Spring4.0从入门到精通视频教程 9.Spring_SpEL  
源文件---功能---内容  
beans-spel.xml	配置文件  	
Main.java	        主程序	
Address.java    类文件  
Car.java  
Person.java  		

###8 cn.codehero.spring.beans.cycle  bean的生命周期  
内容：51CTO：Spring4.0从入门到精通视频教程 10.Spring_管理Bean的生命周期  
源文件---功能---内容  
beans-cycle.xml  配置文件  
Main.java        主程序  
Car.java         类文件  
MybeanPostProcessor.java  

###9 cn.codehero.spring.beans.factory  通过工厂方法配置bean    
内容：51CTO：Spring4.0从入门到精通视频教程 11.Spring_通过工厂方法配置Bean  
源文件---功能---内容  
beans-factory.xml          配置文件  
Main.java                  主程序  
Car.java                   类文件  
InstanceCarFactory.java  
StaticCarFactory.java  

