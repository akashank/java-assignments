/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.capgemini;

import java.util.function.Predicate;

/**
 *
 * @author Ankit Akash
 */
class PerformOperation {
    
    public static Predicate<Integer> isOdd()
	{
		Predicate<Integer> predicate=(element)->{
			return (element%2==0)?false:true;
			
		};
		
		return predicate;
	}
	public static Predicate<Integer> isEven()
	{
		Predicate<Integer> predicate=(element)->{
			return (element%2==0)?true:false;
		};
		return predicate;
	}
	public static Predicate<Integer> isPalindrome()
	{
		Predicate<Integer> predicate=(element)->{
			return (Integer.toString(element)).equals(new StringBuilder(Integer.toString(element)).reverse().toString());
			};
		return predicate;
	}
}
    

