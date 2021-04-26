package Assighment8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter number");
		int num1=scan.nextInt();  //cannot same with line 18  ,num and  num1
		
		System.out.println(isEven(num1));
		
		
	}
public static boolean isEven(int num) {
	
	if(num%2==0) {
   // System.out.println("true");	
		return true;
	}else {
		//System.out.println("false");
		return false;

	}
	
	
	
	
}
}
