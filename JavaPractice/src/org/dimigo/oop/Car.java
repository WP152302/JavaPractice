/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Car
 * 
 * 1. 개요 : Car 클래스로부터 3개의 Car 객체를 생성하여 아래와 같이 출력해보기
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author 권두영
 * @version : 1.0
 */
public class Car {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxspeed = 225;
	private int price = 50000000;
	
	// getter 메소드
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxspeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	// setter 메소드
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		maxspeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	
}
