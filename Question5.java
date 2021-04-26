package Assighment8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter number");
		int num1=scan.nextInt();
		
		sign(num1);
		
		
	}
public static void sign(int num1) {
	
	if(num1>0) {
		System.out.println("1");
	}else if(num1<0) {
		System.out.println("-1");
	}else {
		System.out.println("0");

	}
	
}

}
