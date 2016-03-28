##��Ŀ����:ʵ��spring_framework

##����:
eclipse4.4.2 buildʹ��gradle2.10

##ʹ��:
��ģ������ҵ�Main.java�ļ�������Run As->Java Application,��Console��۲�ʵ����.

##����
1. 51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�	  ���ߣ�١��

##���ṹ�͹�������:
###1 cn.codehero.spring.beans  ����bean��������ע�롢����ע�롢��������bean
�����ļ�:src/main/java/config/spring-beans.xml	
|Դ�ļ�|����|����
|---|---|---|  
|Main.java ��             |��������������	ͨ�ò���  
|HelloWorld.java  	|����ע��					|51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�:1.Spring_HelloWorld  
|Car.java			|������ע��				    |51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�:3.Spring_����Bean  
|Person.java		|	��������bean,�ڲ�bean	|51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�:4.Spring_��������ϸ��  

###2 cn.codehero.spring.beans.collections ������������ϸ�ڣ�list,map    
|Դ�ļ�|����|����
|---|---|---|  
|Main.java��   		|��������������		|51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�:4.Spring_��������ϸ��  
|PersonList.java	|��������List		|51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�:4.Spring_��������ϸ��  
|PersonMap.java		|��������Map			|51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�:4.Spring_��������ϸ��  
|DataSource.java	|getPropertiesʹ��	|51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�:4.Spring_��������ϸ��  
                            
###3 cn.codehero.spring.beans.autowire �Զ�װ��  
���ݣ�51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳�  5.Spring_�Զ�װ��  
Դ�ļ�---����---����  
beans-autowire.xml	�����ļ�  	
Main.java	������	
Address.java ���ļ�  
Car.java  
Person.java  		

###4 cn.codehero.spring.beans.relation  bean����֮��Ĺ�ϵ���̳к�����  
���ݣ�51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳� 6.Spring_Bean֮��Ĺ�ϵ  
Դ�ļ�---����---����  
beans-relation.xml	�����ļ�  	
Main.java			������	
Address.java 		 ���ļ�	
Car.java  
Person.java  	

###5 cn.codehero.spring.beans.scope  bean��������  
���ݣ�51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳� 7.Spring_Bean��������  
Դ�ļ�---����---����  
beans-scope.xml	�����ļ�  	
Main.java	������	
Car.java	���ļ�	

###6 cn.codehero.spring.beans.properties ʹ���ⲿ�����ļ�c3p0�������ݿ�  
���ݣ�51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳� 8.Spring_ʹ���ⲿ�����ļ�  
Դ�ļ�---����---����  
beans-properties.xml	�����ļ�  	
Main.java	  			������	
db.properties			�ⲿ�����ļ�  	

###7 cn.codehero.spring.beans.spel  spel���÷�  
���ݣ�51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳� 9.Spring_SpEL  
Դ�ļ�---����---����  
beans-spel.xml	�����ļ�  	
Main.java	        ������	
Address.java    ���ļ�  
Car.java  
Person.java  		

###8 cn.codehero.spring.beans.cycle  bean����������  
���ݣ�51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳� 10.Spring_����Bean����������  
Դ�ļ�---����---����  
beans-cycle.xml  �����ļ�  
Main.java        ������  
Car.java         ���ļ�  
MybeanPostProcessor.java  

###9 cn.codehero.spring.beans.factory  ͨ��������������bean    
���ݣ�51CTO��Spring4.0�����ŵ���ͨ��Ƶ�̳� 11.Spring_ͨ��������������Bean  
Դ�ļ�---����---����  
beans-factory.xml          �����ļ�  
Main.java                  ������  
Car.java                   ���ļ�  
InstanceCarFactory.java  
StaticCarFactory.java  

