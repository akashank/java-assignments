import java.util.*;
public class average {

	public static void main(String[] args){
		Scanner src=new Scanner(System.in);
		System.out.println("enter the student1 marks");
		double A=src.nextDouble();
		double B=src.nextDouble();
		double C=src.nextDouble();
		double total1=A+B+C;
		double average1=total1/3;
		System.out.println(total1);
		System.out.println(average1);
		System.out.println("enter the student2 marks");
		double A2=src.nextDouble();
		double B2=src.nextDouble();
		double C2=src.nextDouble();
		double total2=A2+B2+C2;
		double average2=total2/3;
		System.out.println(total2);
		System.out.println(average2);
		System.out.println("enter the student3 marks");
		double A3=src.nextDouble();
		double B3=src.nextDouble();
		double C3=src.nextDouble();
		double total3=A3+B3+C3;
		double average3=total3/3;
		System.out.println(total3);
		System.out.println(average3);
		System.out.println("A SUBJECTS' TOTAL");
		System.out.println(A+A2+A3);
		System.out.println("A SUBJECTS' AVERAGE");
		System.out.println((A+A2+A3)/3);
		System.out.println("B SUBJECTS' TOTAL");
		System.out.println(B+B2+B3);
		System.out.println("B SUBJECTS' AVERAGE");
		System.out.println((B+B2+B3)/3);
		System.out.println("C SUBJECTS' TOTAL");
		System.out.println(B+B2+B3);
		System.out.println("C SUBJECTS' AVERAGE");
		System.out.println((C+C2+C3)/3);
	
	
	}
}
	