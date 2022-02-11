package Excercis1;

public class Fan {
	String Code;
	double Price;
	
	public String getCode() {
		return Code.toUpperCase();
	}
	
	public void setCode(String Code) {
		this.Code = Code;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setPrice(double Price) {
		this.Price = Price;
	}
	
	public Fan() {
		
	}
	
	public Fan(String Code, double Price) {
		this.Code = Code;
		this.Price = Price;
	}
}
