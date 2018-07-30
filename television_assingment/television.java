package television_assingment;

import java.util.Scanner;

public class television {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		televisiontest Remote = new televisiontest();
		int volume,channel;
		
		System.out.println("Switcjh ON/OFF");
		String state = scanner.nextLine();
		Remote.setState(state);
		if(state.equals("on"))
		{
			System.out.println("enter channel number");
			channel = scanner.nextInt();
			Remote.setChannel(channel);
			
			System.out.println("press 1 or 0 to increase or decrease volume");
			volume = scanner.nextInt();
			if(volume==1)
			{
				Remote.IncVolume();
				
			}
			else if(volume==0)
			{
				Remote.DecVolume();
			}
			System.out.println("the television information:");
			System.out.println("state"+Remote.getState());
			System.out.println("channel"+Remote.getChannel());
			System.out.println("volume"+Remote.getVolume());
		}
		Remote.setState("OFF");
		
	}

}
