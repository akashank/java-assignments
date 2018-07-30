import java.util.*;

public class triangle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner src = new Scanner(System.in);
		 
		 System.out.println("enter 1st side");
		    double side1 = src.nextDouble();
		
		 System.out.println("enter 2nd side");
			double side2 = src.nextDouble();
			
         System.out.println("enter 3rd side");
		    double side3 = src.nextDouble();
				
		    triangletest triangles = new triangletest();
		    triangles.setSide1(side1);
		    triangles.setSide2(side2);
		    triangles.setSide3(side3);
		    
		   
		    
		    
		   
		    
		    System.out.println("the triangle is isosceles " +triangles.isIsoceles());
		    System.out.println("the triangle is equilateral " +triangles.isEquilateral());
		    System.out.println("the triangle is scalene " +triangles.isScalene());
		    System.out.println("the triangle is right " +triangles.isRight());
		    
		    
		 
		 
	}

}
