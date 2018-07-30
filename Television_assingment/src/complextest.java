
public class complextest {

	double real;
	double imagionary;

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImagionary() {
		return imagionary;
	}

	public void setImagionary(double imagionary) {
		this.imagionary = imagionary;
	}
	static complextest sum(complextest complex1, complextest complex2,complextest complex3) {
		complextest complex4 = new complextest();
		
		complex4.real = complex1.real + complex2.real + complex3.real;
		complex4.imagionary = complex1.imagionary + complex2.imagionary + complex3.imagionary;
		return complex4;
	}
		
	
public void disp()
{
	
	System.out.println(real + "i" +imagionary);
}
	
	
}
