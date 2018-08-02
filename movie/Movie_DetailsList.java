package com.movie;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

//creating class 
public class Movie_DetailsList {

	
		Set<Movie_Details> movie = new LinkedHashSet<>();
		
		public void addMovie(Movie_Details mov_Name)
		{
			movie.add(mov_Name);
			System.out.println(mov_Name.getMov_Name()+ "  added");
			
		}
		
		public void removeMovie(String mov_Name)
		{
			Predicate<Movie_Details> delMovie = Movie_Details -> Movie_Details.getMov_Name().equals(mov_Name);
			movie.removeIf(delMovie);
	
		}
		public void removeAll()
		{
			movie.clear();
			System.out.println("all movies deleted");
		}
	//find the name movie
		public boolean findByName(String mov_Name)
		{
			Predicate<Movie_Details> checkMovieByName = Movie_Details -> (Movie_Details.getMov_Name().equals(mov_Name));
			return movie.stream().anyMatch(checkMovieByName);
			
		}
		//find the name of genre
		public boolean findByGenre(String genre)
		{
			Predicate<Movie_Details> checkMovieByGenre = Movie_Details -> (Movie_Details.getGenre().equals(genre));
			return movie.stream().anyMatch(checkMovieByGenre);
			
		}
		
		//display method
		public void display()
		{
			Consumer<Movie_Details> disp = Movie_Details -> System.out.println(Movie_Details);
			movie.stream().forEach(disp);
		}
		
		
		
	
		
	

}
