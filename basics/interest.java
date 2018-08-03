package in.co.capgemini.basics;
import java.util.*;

public class interest {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		
		double p = src.nextDouble();
		double rate = src.nextDouble();
		double time = src.nextDouble();
		//calculate simple interest
		double si = p * rate * time / 100; 
		//calculate compound interest
		double ci = p * Math.pow((1 + rate / time), time);
		
		System.out.println("the simple interest is");
		System.out.println(si);
		System.out.println("the compound interest is");
		System.out.println(ci);

	}
}
