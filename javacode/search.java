import java.util.*;
public class search {


	public static void main(String[] args){
		int a[] = new int[5],i;
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		for(i=0;i<5;i++)
		{
			a[i]= src.nextInt();
			
		}
		int x;
		System.out.println("Enter the number to be searched");
		x=src.nextInt();
		
		for(i=0;i<5;i++)
		{
			if(a[i]==x)
			{
				System.out.println("yes");
			}
		}
	}
}
	