import java.util.*;
public class palindrome {


	public static void main(String[] args)
	{
		int num,m,a=0,x;
		Scanner src = new Scanner(System.in);
		System.out.print("Enter number");
		num=src.nextInt();
		m=num;
		if(num>0){
		while(num>0)
		{
		x=num%10;
		a=a*10+x;
		num=num/10;
		
		}
		
		if(a==m)
		{
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
		}
		}
		else{
			System.out.println("invalid");
		}
	}
}