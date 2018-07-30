package training;
//corporate child class
public class CorporateTraining extends Training{
	private int days;//instance member;
	private double cost;
	
	public CorporateTraining(int Id, String subject, double fees, int days)
	{
		super(Id, subject, days);
		this.days = days;
		
	}
	public double getCost() {  //getter
		// TODO Auto-generated method stub
		return cost;
	}

	
	public void getOrderValue() {     //calculate cost
		// TODO Auto-generated method stub
		this.cost = days*getFees();
	}
	

	

}
