import java.util.Scanner;
public class arm2{
	public static void main(String[] args)
	{
		int a,c,r;
		
		
		for(a=100;a<1000;a++)
		{int b = a,sum=0;
		while(a>0)
		{
			r=b%10;
			b=b/10;
			c=r*r*r;
		
			sum=sum+c;
		}
		if(sum==a)
		{
			System.out.println(sum);
		}
	
		
	
	}
	
}
}