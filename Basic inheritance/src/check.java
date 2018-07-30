
public class check  {
	public int Id;
	private double salary; //variable initialised
 protected double atmPswd;
	int age;
	/*check(int Id,double salary, double atmPswd, int age){
		this.Id =Id;
		this.salary = salary;
		this.atmPswd = atmPswd;
		this.age = age;
	}*/
	
	
	public void disp(int Id,double salary, double atmPswd, int age) {   //member function with void return
		
		System.out.println("my id is"+Id);
		System.out.println("my salary is"+salary);   
		System.out.println("my atm password is"+atmPswd);  //print values on screen
		System.out.println("my age is"+age);
		
	}

}
