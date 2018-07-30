import java.util.*;

public class countryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner src = new Scanner(System.in);
		
		System.out.println("enter the number of countries");
		int n;
		n=src.nextInt();
		countryytest country[]= new countryytest[n];
	    
		
		
		for(int i=0; i<n;  i++)
		{
			country[i]= new countryytest();
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name of "+(i+1)+"country");
			country[i].setNameOfCountry(src.next());
			
			System.out.println("enter the population of "+(i+1)+"country");
			country[i].setPopulation(src.nextDouble());
			
			System.out.println("enter the area of "+(i+1)+"country");
			country[i].setArea(src.nextDouble());
			
			
		}
		
		double max = country[0].getArea();
		String maxArea = "0";
		for(int i=0;i<n;i++)
		{
			if(max<country[i].getArea()) {
				max = country[i].getArea();
				maxArea=country[i].getNameOfCountry();
				
			}
		}
		System.out.println(maxArea + " is country with maximum area");
		
		
		double populationDensity[]= new double[n];
		
		for(int i=0;i<n;i++)
		{
			populationDensity[i]= country[i].getArea()/country[i].getPopulation();
			
			
		}
		double maxPopDensity = populationDensity[0];
		String maxPopulationDensity = "0";
		for(int i=0;i<n;i++)
		{
			if(max<country[i].getPopulation()) {
				maxPopDensity = country[i].getPopulation();
				maxPopulationDensity=country[i].getNameOfCountry();
				
			}
	
		
	}
		System.out.println(maxPopulationDensity + " is country with maximum population density");
		
		double maxPop = country[0].getArea();
		String maxPopulation = "0";
		for(int i=0;i<n;i++)
		{
			if(maxPop<country[i].getPopulation()) {
				maxPop = country[i].getPopulation();
				maxPopulation=country[i].getNameOfCountry();
				
			}
		
		
	}
		System.out.println(maxPopulation + " is country with maximum population");
		
    src.close();
}
}
