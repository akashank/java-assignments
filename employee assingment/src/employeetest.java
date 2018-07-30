public class employeetest {

int Id;
String name;
double monthlyBasic;
double hra=monthlyBasic/2;

int medical = 1250;
int conveyance = 800;
double pf,esic,profTax;
public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}
public int getMedical() {
	return medical;
}

public void setMedical(int medical) {
	this.medical = medical;
}

public int getConveyance() {
	return conveyance;
}

public void setConveyance(int conveyance) {
	this.conveyance = conveyance;
}

public double getPf() {
	return pf;
}

public void setPf(double pf) {
	this.pf = pf;
}

public double getEsic() {
	return esic;
}

public void setEsic(double esic) {
	this.esic = esic;
}

public double getProfTax() {
	return profTax;
}

public void setProfTax(double profTax) {
	this.profTax = profTax;
}

public double getHra() {
	return hra;
}

public void setHra(double hra) {
	this.hra = hra;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMonthlyBasic() {
	return monthlyBasic;
}
public void setMonthlyBasic(double monthlyBasic) {
	monthlyBasic = monthlyBasic;
}
double getAnnualBasic()
{
	return 12*monthlyBasic;
	
}
double getMonthlyGrossSalary()
{
	
	double p = (hra+medical+conveyance);
	 return p;
}

double getAnnualGrossSalary()
{
	return monthlyBasic+hra+medical+conveyance;
}

double getMonthlyDeductions()
{
	if((0.1*monthlyBasic)<6500)
	{
	  pf=0.1*monthlyBasic;
	}
	else
	{
		pf=6500;
	}
	if(monthlyBasic<=5000)
	{
		esic=0.475*monthlyBasic;
	}
    
	if((hra + medical + conveyance)<=10000)
	{
		profTax=50;
	}
	else
	{
		profTax=100;
	}
	
	return pf+esic+profTax;
	
}

double getMonthlyTakeHome()
{
	return getMonthlyGrossSalary() - getMonthlyDeductions();
}
double getAnnualTakeHome()
{
	return 12 * getMonthlyTakeHome();
}
}