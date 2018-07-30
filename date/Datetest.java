package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Datetest {

	public static void main(String[] args) throws ParseException 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the dobin DD/MM/YYYY format :");
		String input = scanner.nextLine();
		scanner.close();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Calendar dob = Calendar.getInstance();
		dob.setTime(sdf.parse(input));
		Date Age = new Date(dob);
		Age.getAge(dob);
		
		System.out.println("age of the person is:"+Age.getAge()+ "years" +Age.getMonth()+" months "+" days old");
		

	}

}
