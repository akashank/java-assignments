import java.util.Scanner;

public class time {

	public static void main(String[] args) {
Scanner src=new Scanner(System.in);
		
		System.out.println("enter hour1");
		int hour1 = src.nextInt();
		System.out.println("enter the minute1");
		int minute1 = src.nextInt();
		

		timetest time1 = new timetest();
		time1.setHour(hour1);
		time1.setMinute(minute1);
		
		

		System.out.println("enter hour2");
		int hour2 = src.nextInt();
		System.out.println("enter the minute2");
		int minute2 = src.nextInt();
		
		timetest time2 = new timetest();
		time2.setHour(hour2);
		time2.setMinute(minute2);
		
		timetest timesum = new timetest();
		timesum=timetest.sum(time1,time2);
       
		 System.out.println("new time is " +timesum.hour + "hours" + "   "+timesum.minute+"minutes");
		
		src.close();
		
		
	}

}
