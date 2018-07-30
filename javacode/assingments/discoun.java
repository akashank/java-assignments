package assingments;
import java.util.*;
public class discoun {

		public static void main(String[] args) {
			
		Scanner src = new Scanner(System.in);
		System.out.println("enter the price of item");
		double price=src.nextDouble();
		double discount=0.35*price;
		double newprice=price-discount;
		System.out.println(newprice);
		
		
		
		

}
}
