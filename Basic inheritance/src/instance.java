
public class instance {
	double new_salary;
	
	static double disp(double salary) {  //creating function
		
		 double new_salary = 2*salary;
		 System.out.println("my new salary is :"+new_salary);
		return new_salary;//return new salary with double type
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		nonstatics object = new nonstatics(); //creating object
		
		object.display(1000);//calling display
		disp(1000);
		
		

	}

}
