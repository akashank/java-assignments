package training;

public class TrainingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training training = new PublicTraining(1,"java" ,5000,50);//object 1
		Training training1 = new CorporateTraining(2,"bigdata",35000,4);//object2
		
		training1.getOrderValue();//invoking member function for calculating cost
		System.out.println("the total cost of java training is"+training.getCost());
		training1.getOrderValue();
		
		System.out.println("the total cost of bigdata training is"+training1.getCost());//display
		
		
		

	}

}
