import java.util.*;
public class income{
	public static void main(String[] args)
	{
		double tax;
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter your CTC");
		double salary=src.nextDouble();
		if(salary<180001)
		{
			tax=0;
			System.out.println(tax);
		}
		else if(salary>=180001 && salary<300001)
		{
			tax=0.1*salary;
			System.out.println(tax);
			
		}
		else if(salary>=300001 && salary<500001)
		{
			tax=0.2*salary;
			System.out.println(tax);


			}
		else if(salary>=500001 && salary<=1000000)
		{
			tax=0.3*salary;
			System.out.println(tax);
		}
			
			
	}
}