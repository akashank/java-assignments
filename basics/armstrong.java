package in.co.capgemini.basics;
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int a, c, r;  //Initializing the variables
      
		
		//applying for loop
		
		for (a = 100; a < 1000; a++) {
			int b = a, sum = 0;
			
			//logic to know Armstrong number
			while (a > 0) {
				r = b % 10;
				b = b / 10;
				c = r * r * r;

				sum = sum + c;
			}
			if (sum == a) {
				
				//printing the number
				System.out.println(sum);
			}

		}

	}
}
