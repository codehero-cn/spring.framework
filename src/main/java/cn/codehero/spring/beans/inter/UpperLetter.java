package cn.codehero.spring.beans.inter;
/**
 * //把小写字母->大写
 * @author eleven
 *
 */
public class UpperLetter implements ChangeLetter {
	
	private String str;
	
	@Override
	public String change() {
		
		return str.toUpperCase();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
