
public class timetest {
int hour, minute;

public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	this.minute = minute;
}
static timetest sum(timetest time1 , timetest time2) {
	timetest time = new timetest();
	
	time.hour = time1.hour + time2.hour;
	time.minute = time1.minute + time2.minute;
	return time;
}
	

public void disp()
{

System.out.println(hour + " " +minute);
}}

