package generics;

import java.util.Date;

public class GenericsBenefits {
	
	public static void main (String [] args){
		/*
		 * Compiles then throws error at runtime
		 */
		//Comparable c = new Date();
		//System.out.println(c.compareTo("red"));
		
		/*
		 * Adding generic type does not let you compile 
		 */
		Comparable<Date> c = new Date();
		System.out.print(c.compareTo("red"));
	}

}
