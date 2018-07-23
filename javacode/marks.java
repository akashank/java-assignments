import java.util.*;
public class marks {
	public static void main(String[] args)
	{
	
        
		Scanner src = new Scanner(System.in);
		double phy= src.nextDouble();
		double chem= src.nextDouble();
		double math= src.nextDouble();
		if((phy+chem+math)>=180)
		{
			System.out.println("passed");
		}
		else if((phy+chem)>120||(math+chem)>120||(phy+math)>120)
		{
			System.out.println("Promoted");
		}			
		else{
			System.out.println("Failed");
		}
		
		
	}
}