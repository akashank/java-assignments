package training;
//public child class
public  class PublicTraining extends Training {
	private int participants;//instance member
	private double cost;
	
	public PublicTraining (int Id, String subject, double fees, int participants)
	{
		super(Id, subject, fees);
		this.participants = participants;
	}
	
	@Override
	public double getCost() {  //getter
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public void getOrderValue() {     //calculate cost
		// TODO Auto-generated method stub
		this.cost = participants*getFees();
	}

}
