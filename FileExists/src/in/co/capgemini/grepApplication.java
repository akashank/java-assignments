package in.co.capgemini;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class grepApplication {

	public static void main(String[] args) throws FileNotFoundException {
		
		int count = 0,not_found = 0;
		File file = new File("c:\\Users\\aakash\\Desktop\\akash.txt\\");
		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(file);
		
		System.out.println("please enter the search string :");
		String name = scanner.nextLine();
		
		System.out.println("please enter the file to be searched");
		String file1 = scanner.nextLine();
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			if(line.contains(name)) {
				count++ ;
				System.out.println("string" +name+ "occurs at line " + line+ "found at " +count);
				
			}
			else {
				count++;
				not_found++;
			}
			
		}
		if(count == not_found) {
			System.out.println("String "+name+" not found");
		}

	}

}
