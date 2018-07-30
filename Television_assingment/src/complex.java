import java.util.*;
public class complex {
	
	public static void main(String[] args) 
	
	{
		
		Scanner src=new Scanner(System.in);
		
		System.out.println("enter the real1 ");
		double real1 = src.nextDouble();
		System.out.println("enter the imagionary1 ");
		double imagionary1 = src.nextDouble();
		
		complextest complex1 = new complextest();
		complex1.setReal(real1);
		complex1.setImagionary(imagionary1);
		
		System.out.println("enter the real2 ");
		double real2 = src.nextDouble();
		System.out.println("enter the imagionary2 ");
		double imagionary2 = src.nextDouble();
		
		complextest complex2 = new complextest();
		complex2.setReal(real2);
		complex2.setImagionary(imagionary2);
		
		System.out.println("enter the real3 ");
		double real3 = src.nextDouble();
		System.out.println("enter the imagionary3 ");
		double imagionary3 = src.nextDouble();
		
		complextest complex3 = new complextest();
		complex3.setReal(real3);
		complex3.setImagionary(imagionary3);
		
		complextest complexsum = new complextest();
		complexsum=complextest.sum(complex1,complex2,complex3);
		
		System.out.println("new no. is " +complexsum.real+ "   i"+complexsum.imagionary);
		src.close();
		
		
		
		
		
		
	
		
		
	}

}
