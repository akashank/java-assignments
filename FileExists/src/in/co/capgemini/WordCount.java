package in.co.capgemini;


import java.io.*;
import java.util.Scanner;


public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner console = new Scanner(new File("c:\\Users\\aakash\\Desktop\\akash.txt\\"));
		
		int words = 0;
		while(console.hasNext())
		{
			console.next();
			words++;
		}
		System.out.println("number of words are "+words);
		
	}
}	