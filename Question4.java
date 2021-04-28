package Assighment8;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

	String star = "";

		for (int row = 0; row < num; row++) {
			if (row == 0 || row == num - 1) {
				for (int i = 0; i < num - 1; i++) {
					star += "*";
				}
				System.out.print(star);
				star = "";
			} else {
				System.out.print("*");
			}
			for (int col = 0; col < num - 2; col++) {
				if (!(row == 0 || row == num - 1)) {
					System.out.print(" ");
				}

			}

			System.out.println("*");
    }
}}
