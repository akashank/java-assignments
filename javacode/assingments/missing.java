package assingments;
import java.util.Scanner;
public class missing {

	public static void main(String[] args) {
		
		
		int n,i;
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the numbers");
		n=src.nextInt();
		int actualsum=n*(n+1)/2;
		System.out.println(actualsum);
		int sum=0;
		int a[] = new int[10];
		for(i=1;i<n;i++)
		{
			 a[i]=src.nextInt();
		}
		
		for(i=1;i<n;i++)
		{
			 sum=sum+a[i];
		}
		
		System.out.println("missing number");
		System.out.print(actualsum-sum);
		
		

	}

}
