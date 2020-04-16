package Revision.java;

public class Exchange {
 
	double amount, rate, conversion;
	//declare data members - amount, rate, conversion
	public Exchange (){
		
	}
	//constructor
	public Exchange(double amount, double rate) {
		this.amount = amount;
		this.rate = rate;
	}
	//constructor with parameters(amount, rate)
	
	public void setRate(double rate) {
		
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	//set methods
	public void compute (){
		conversion = amount * rate;
		
	}
	//calculation = conversion
	public double getConversion() {
		return conversion;
	}
	
	
	//get method return conversion
	
}
