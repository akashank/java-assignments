package com.movie;

import java.util.*;


public class Movie_main {

	public static void main(String[] args) 
	{
		
		
		Movie_DetailsList details = new Movie_DetailsList();  //creating object of movie details
		
		//adding the required information of movie 
		details.addMovie(new Movie_Details("ramanujan", "srama", "sweety", "biopic"));
		details.addMovie(new Movie_Details("sanju", "ranbir", "anushka", "biography"));
		details.addMovie(new Movie_Details("Conjuring", "james", "lorraine", "horror"));
		details.addMovie(new Movie_Details("gangs of wasseypur", "manoj", "huma", "action thriller"));
		
		//check the conditions if movie exist or not
		boolean checkByName = details.findByName("race");
		if(checkByName)
		{
			System.out.println("movie found");
		}
		else
		{
			System.out.println("not found");
		}
		
		
		//check the conditions if movie genre exist or not
		boolean checkByGenre = details.findByGenre("comedy");
		if (checkByGenre)
		{
			System.out.println("movie found");
		}
		else
		{
			System.out.println("movie not found");
		}
		details.removeMovie("race");
		details.display();
		
		
		
		

	}
	
	

}
