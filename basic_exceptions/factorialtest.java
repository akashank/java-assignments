package basic_exceptions;

import java.util.Scanner;

public class factorialtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner src = new Scanner(System.in);
		System.out.println("enter the integer:");
		int n = src.nextInt();

		factorial Factorial = new factorial();
		try {
			int p = Factorial.getFactorial(n);

			System.out.println("the factorial is " +p);
		}catch (InvalidInputException e) {
			e.printStackTrace();
		} catch (FactorialException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
