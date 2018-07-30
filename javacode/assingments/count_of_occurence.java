package assingments;

import java.util.Scanner;

public class count_of_occurence {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter input");
		int n=src.nextInt();
		String strs[]=new String[n+1];
		int c=0;
		System.out.println("Enter names");
		for(int i=0;i<=n;i++)
		{
			strs[i]=src.nextLine();
			
		}
		System.out.println("Enter name to be searched");
		String name=src.nextLine();
		for(int i=0;i<=n;i++)
		{
			if(name.equals(strs[i]))
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
