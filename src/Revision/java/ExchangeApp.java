package Revision.java;
import java.util.*;
public class ExchangeApp {

	public static void main(String[] args) {
		//local variables
		double rate, amount, conversion = 0;
		//declare objects
		Exchange myExchange = new Exchange();
		Scanner sc = new Scanner (System.in);
		//input
		System.out.println("Please enter amount to be converted: ");
		amount = sc.nextDouble();
		//setMethod to put scanner value
		myExchange.setAmount(amount);
		
		System.out.println(" Please enter the conversion rate: ");
		rate = sc.nextInt();
		//setMethod
		myExchange.setRate(rate);
		//process
		myExchange.compute();
		conversion = myExchange.getConversion();
		//output
		System.out.println(amount + " at a rate of " + rate + " is" + conversion);
	} 

}
