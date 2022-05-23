package ch18;

import java.io.Serializable;

public class SeriEx implements Serializable {
	//객체 직렬화 : 메모리에 저장된 객체를 파일로 저장하거나 네트워크 통해 전송할 때 사용
	//Serializable 인터페이스를 구현해야한다.
	//MVC패턴 Model View Controller
	//DTO : Data Transfer Object 데이터 전달 객체
	//VO : ValueObject , 생성자없이 getter,setter
	//DAO : 데이터 조작 객체(DB)
	
	private String coffee;
	private String cookie;
	private String bread;
	private int price;
	private int amount;
	public SeriEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SeriEx(String coffee, String cookie, String bread, int price, int amount) {
		super();
		this.coffee = coffee;
		this.cookie = cookie;
		this.bread = bread;
		this.price = price;
		this.amount = amount;
	}
	public String getCoffee() {
		return coffee;
	}
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "SeriEx [coffee=" + coffee + ", cookie=" + cookie + ", bread=" + bread + ", price=" + price + ", amount="
				+ amount + "]";
	}
	
	
	
	

}
