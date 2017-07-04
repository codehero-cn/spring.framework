package cn.codehero.spring.beans.inter;

/**
 * 把大写字母--》小写
 * @author eleven
 *
 */
public class LowerLetter implements ChangeLetter {

	private String str; 
	
	@Override
	public String change() {
		
		
		return str.toLowerCase();
	}
	
	public void setstr(String str){
		this.str=str;
	}
	
	public String getstr(){
		return str;
	}

}
