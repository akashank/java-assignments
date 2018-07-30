import java.util.Scanner;

public class employee {
	
	public static void main(String[] args) 
	
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the ID");
		int Id = src.nextInt();
		System.out.println("Enter the employee name");
		String name = src.next();
		System.out.println("Enter the monthly basic");
		double monthlyBasic = src.nextDouble();
		
		employeetest employees = new employeetest ();
		
		System.out.println("MONTHLY gross salary is " +employees.getMonthlyGrossSalary());
		System.out.println("annual basic salary is "+employees.getAnnualBasic());
		System.out.println("annual gross salary is "+employees.getAnnualGrossSalary());
		System.out.println("monthly deductions is "+employees.getMonthlyDeductions());
		System.out.println("monthly take home is "+employees.getMonthlyTakeHome());
		System.out.println("annual take home is "+employees. getAnnualTakeHome());
		
		
		
	}
	
	}