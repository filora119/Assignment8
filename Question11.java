package Assighment8;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter number1");
		int num1=scan.nextInt();
		System.out.println("Enter number2");
		int num2=scan.nextInt();
		
		System.out.println(c_profit(num1,num2));
    
	}
public static String c_profit(int buyPrice,int sellPrice) {
	
	if(sellPrice>buyPrice) {
		//System.out.println("profit");
		return "profit";
	}else if(sellPrice<buyPrice) {
		//System.out.println("loss");
        return "loss";
	}else {
		//System.out.println("no loss");
        return "no loss";
	}
	
	
}
}
