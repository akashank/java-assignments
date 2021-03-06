package com.movie;

public class Movie_Details {
	
	private String mov_Name; //variables initialised
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	//constructors are formed
	public Movie_Details(String mov_Name, String lead_actor, String lead_actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	
	//getters and setters

	public String getMov_Name() {
		return mov_Name;
	}

	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actress() {
		return lead_actress;
	}

	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//to string

	@Override
	public String toString() {
		return "Movie_Details [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + ", Mov_Name=" + getMov_Name() + ", Lead_actor=" + getLead_actor()
				+ ", Lead_actress=" + getLead_actress() + ", Genre=" + getGenre() + "]";
	}
	
	
	
	
	
	
	

	
	

	
}
