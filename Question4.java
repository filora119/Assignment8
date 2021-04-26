package Assighment8;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/* Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number");
		 int n=sc.nextInt();*/
		     Object a=1;
			
			display(7);
	    
		
		
		
		
	}
	public static void display(int n)
    {
    // Outer for loop for number of lines
    for (int i = 0; i<=n; i++) {
    // Inner for loop for logic execution
    for (int j = 0; j<= n / 2; j++) {
    // prints two column lines
    if ((j == 0 || j == n / 2) && i != 0 ||
    // print first line of alphabet
    i == 0  && j != n / 2 ||
    // prints middle line
    i == n / 2)
    System.out.print("*");
    else
    System.out.print(" ");
    }
    System.out.println();
    }
}}
