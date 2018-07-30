package training;
//training parent calss
abstract public class Training {
	
	private int Id;
	private String subject;
	private double fees;
	public  Training(int Id, String subject, double fees) {
		super();
		this.Id = Id;
		this.subject = subject;
		this.fees = fees;
		
		
	}
	public double getFees()
	{
		return fees; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	abstract public double getCost();
	abstract public void getOrderValue();
	
	

}
