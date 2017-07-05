package cn.codehero.spring.beans.collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 带各种集合属性的类
 */
public class Person {
	private String name;
	private int age;	
	private String[] hobby;
	private List<Car> carsList;
	private Set<Car>  carsSet;
	private Map<String,Car>  carsMap;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public List<Car> getCarsList() {
		return carsList;
	}
	public void setCarsList(List<Car> carsList) {
		this.carsList = carsList;
	}

	
	public void setCarsSet(Set<Car> carsSet){
		this.carsSet=carsSet;
	}
	
	public Set<Car> getCarsSet(){
		return carsSet;
	}
	
	public void  setCarsMap(Map<String,Car>  carMap){
		this.carsMap=carMap;
	}
	public Map<String,Car> getCarsMap(){
		return carsMap;
	}
	
}

