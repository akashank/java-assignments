
public class triangletest {

	
		double side1,side2,side3;
		public String isRight;

		public double getSide1() {
			return side1;
		}

		public void setSide1(double side1) {
			this.side1 = side1;
		}

		public double getSide2() {
			return side2;
		}

		public void setSide2(double side2) {
			this.side2 = side2;
		}

		public double getSide3() {
			return side3;
		}

		public void setSide3(double side3) {
			this.side3 = side3;
		}
		
		boolean isRight()
		{
			 if(((side1*side1)==(side2*side2)+(side3*side3))||((side2*side2)==(side1*side1)+(side3*side3))||((side3*side3)==(side2*side2)+(side1*side1)))
			    {
		    	      return true;
			    }
			    else
			    {
			    	return false;
			    }
		}
		
		boolean isScalene()
		{
			 if(side1!=side2&&side2!=side3&&side1!=side3)
			    {
		    	      return true;
			    }
			    else
			    {
			    	return false;
			    }
		}
		
		boolean isEquilateral()
		{
			 if(side1==side2&&side2==side3)
			    {
		    	      return true;
			    }
			    else
			    {
			    	return false;
			    }
		}
		
		boolean isIsoceles()
		{
			 if((side1==side2&&side1!=side3)||(side2==side3&&side2!=side1)||(side1==side3&&side1!=side2))
			    {
		    	      return true;
			    }
			    else
			    {
			    	return false;
			    }
			    
		}
	}


