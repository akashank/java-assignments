package television_assingment;

public class televisiontest {

	private String state;
	private int Channel;
	private int volume;
	
	public void television (String state, int channel, int volume) {
		super ();
		this.state = state;
		this.Channel = channel;
		this.volume = volume;
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getChannel() {
		return Channel;
	}

	public void setChannel(int channel) {
		this.Channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void IncVolume() {
		this.volume +=1;
	}
	public void DecVolume()
	{
		this.volume-=1;
	}
	
	
}
