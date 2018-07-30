package basic_exceptions;

class InvalidInputException extends Exception{
	public InvalidInputException(String message) {
		super(message);
	}
}
class FactorialException extends Exception{
	public FactorialException(String message) {
		super(message);
	}
	
}

public class factorial {

	int getFactorial(int n) throws Exception {
		long fact = 1;
		if(n==0 || n==1|| n<0)
		{
			throw new InvalidInputException("number cannot be 0,1 or negative");
		}

		for (int i = 1; i <= n; ++i) {

			fact = fact * i;

		}
		if(fact>-2147483648)
		{
			throw new FactorialException("invalid");
		}
		return (int)fact;

	}
}

	
