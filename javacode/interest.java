import java.util.*;
class interest {
public static void main(String[]args){

	Scanner src=new Scanner(System.in);
	double p= src.nextDouble();
	double rate=src.nextDouble();
	double time=src.nextDouble();
	double si=p*rate*time/100;
	System.out.println(si);
	double ci=p*Math.pow((1+rate/time),time);
	System.out.println("the simple interest is");
	System.out.println(si);
	System.out.println("the compound interest is");
	System.out.println(ci);
	
}
}