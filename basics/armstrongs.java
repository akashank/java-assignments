package in.co.capgemini.basics;

import java.util.Scanner;

public class armstrongs {

	public static void main(String[] args) {
		int a, c, r, sum = 0;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		int b = a;
		
		//logic to print Armstrong between two numbers
		
		while (a != 0) {
			r = a % 10;
			a = a / 10;
			c = r * r * r;

			sum = sum + c;
		}
		if (sum == b) {
			System.out.println("the number is armstrong ");
		} else {
			System.out.println("the number is not armstrong");
		}
	}
}
