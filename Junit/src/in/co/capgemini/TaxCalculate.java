package in.co.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxCalculate {
	private String empName;
	private double empSal;
	private boolean isIndian;
	 
	public TaxCalculate(String empName, double empSal , boolean isIndian) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.isIndian = isIndian;
		
	}
	public double CalculatorTax()throws EmployeeNameInvalidException,CountryNotValidException,TaxNotEligibleException {
		double taxAmt = 0;
		if(isIndian == true) {
			if(empName.isEmpty()) {
			throw new EmployeeNameInvalidException("employee name cannot be null");
		}
		else {
			if(empSal >= 100000) {
				taxAmt = empSal*0.8;
			}
			else if(empSal >=50000 && empSal <= 100000) {
				taxAmt = empSal * 0.8;
			
			}
			else if(empSal >= 30000 && empSal <= 50000) {
				taxAmt = empSal*0.5;
			}
			else if (empSal >=10000 && empSal <=30000) {
				taxAmt = empSal*0.4;
			}
			else
				throw new TaxNotEligibleException("not eligible for tax");
			
		}
	}
	else{
		throw new CountryNotValidException("country is not valid");
	}
	return taxAmt;
}
}