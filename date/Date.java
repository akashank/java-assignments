package date;

import java.util.Calendar;

public class Date
	{
		private Calendar dob;
		private int age;
		private int month;
		private int day;
	
		
		public Date(Calendar dob) {
			super();
			this.dob = dob;
		}
		public void getAge(Calendar dob)
		{
			Calendar today = Calendar.getInstance();
			int CurYear = today.get(Calendar.YEAR);
			int dobYear = dob.get(Calendar.YEAR);
			this.age = CurYear - dobYear;
			
			
			int CurMonth = today.get(Calendar.MONTH);
			int dobMonth = dob.get(Calendar.MONTH);
			this.month = dobMonth - CurMonth;
			
			
			int CurDay = today.get(Calendar.DAY_OF_MONTH);
			int dobDay = dob.get(Calendar.DAY_OF_MONTH);
			this.day = CurDay - dobDay;
			
			if(dobMonth > CurMonth)
			{
				this.age-- ;
			}
			else if (dobMonth == CurMonth)
			{
				if(dobDay>CurDay)
				{
					this.age--;
				}
			}
		}
		public int getAge()
		{
			return age;
		}
		public int getMonth()
		{
			return month;
		}
		public int getDay()
		{
			return day;
			
		}
	}


