import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
Scanner src=new Scanner(System.in);
		
		System.out.println("enter feet1");
		int feet1 = src.nextInt();
		System.out.println("enter the inch1");
		float inch1 = src.nextFloat();
		
		distancetest distance1 = new distancetest();
		distance1.setFeet(feet1);
		distance1.setInch(inch1);
		
		

		System.out.println("enter feet2");
		int feet2 = src.nextInt();
		System.out.println("enter the inch2");
		float inch2 = src.nextFloat();
		
		distancetest distance2 = new distancetest();
		distance2.setFeet(feet2);
		distance2.setInch(inch2);
		
	     distancetest distancesum = new distancetest();
		distancesum=distancetest.sum(distance1,distance2, distancesum);
		
		System.out.println("new distance is " +distancesum.feet+ "   " +distancesum.inch);
		
		src.close();
		
		
		
		
	}

}
