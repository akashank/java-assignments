import java.util.*;
public class rectangle {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter the length and breadth for rectangle 1: ");
		
		double length1=src.nextDouble();
		double breadth1=src.nextDouble();
		
		rectangletest rectangle1 = new rectangletest();
		rectangle1.setLength(length1);
		rectangle1.setBreadth(breadth1);
		
		double area1 = rectangle1.area();
		double perimeter1 =  rectangle1.perimeter();
		
		System.out.println("area of recatngle1 is "+area1);
		System.out.println("perimeter of rectangle1 is "+perimeter1);
		
		System.out.println("enter the length and breadth for rectangle 2: ");
		
		double length2=src.nextDouble();
		double breadth2=src.nextDouble();
		
		rectangletest rectangle2 = new rectangletest();
		rectangle2.setLength(length2);
		rectangle2.setBreadth(breadth2);
		
		double area2 = rectangle2.area();
		double perimeter2 =  rectangle2.perimeter();
		
		
		System.out.println("area of recatngle2 is "+area2);
		System.out.println("perimeter of rectangle2 is "+perimeter2);
		
		if(area1 == area2)
		{
			System.out.println("area of recatngle1 and rectangle2 are same ");
		}
		else
		{
			System.out.println("area of recatngle1 and recxtangle2 are not same ");
		}
		
		
		
		
		
		
		

	}

}
