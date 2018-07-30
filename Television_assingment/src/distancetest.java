
public class distancetest {
	int feet ; float inch;


	public int getFeet() {
		return feet;
	}


	public void setFeet(int feet) {
		this.feet = feet;
	}


	public float getInch() {
		return inch;
	}


	public void setInch(float inch) {
		this.inch = inch;
	}
	static distancetest sum(distancetest distance1 , distancetest distance2,distancetest distance3) {
		distancetest distance = new distancetest();
		
		distance.feet = distance1.feet + distance2.feet;
		distance.inch = distance1.inch + distance2.inch;
		return distance;
	}
		
	
public void disp()
{
	
	System.out.println(feet + " " +inch);
}}



