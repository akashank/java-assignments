
package in.co.capgemini;

import org.junit.Test;

import junit.framework.Assert;

public class testTaxCalculator {
	
	@SuppressWarnings("deprecation")
	@Test(expected=CountryNotValidException.class)
	public void test1() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException {
		TaxCalculate taxcal = new TaxCalculate("Ron",34000,false);
		double tax = taxcal.CalculatorTax();
	}
	
	@Test(expected=TaxNotEligibleException.class)
	public void test2() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException {
		TaxCalculate taxcal = new TaxCalculate("Tim",1000,true);
		double tax = taxcal.CalculatorTax();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test3() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException {
		TaxCalculate taxcal = new TaxCalculate("jack",55000,true);
		double tax = taxcal.CalculatorTax();
		//double val=new Double(3300);
		
		
	}
	
	@Test(expected=EmployeeNameInvalidException.class)
	public void test4() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException {
		TaxCalculate taxcal = new TaxCalculate("",55000,true);
		double tax = taxcal.CalculatorTax();
	}
	
	
	
}
