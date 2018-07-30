package assingments;

import java.util.Scanner;

public class duplicates {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("input");
		String str=src.nextLine();
		char[] name=str.toCharArray();
		for(int i=0;i<name.length;i++)
		{
			char a=name[i];
			for(int j=i+1;j<name.length;j++)
			{
				if(a==name[j])
				{
					name[j]=' ';
					
				}
			}
		}
	String string = new String(name);
	string=string.replaceAll(" ","");
	System.out.print("output: "+string);
	

	}

}
