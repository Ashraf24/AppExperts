package apollo.exercises.ch08_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.math.*;
public class Ex2_Generics {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Directions:
		
		// 1) Initialize an ArrayList of Strings to 5 strings using:
		//    new ArrayList<String>(Arrays.asList("hello", "goodbye"));
		ArrayList<String>list=new ArrayList<String>(Arrays.asList("mithu","titu","shima","shikha","rima"));
		
		
		
		// 2) Try to add an integer to that ArrayList using something like:
		//    array.add(5);
		//list.add(5);
		

		//    Note what the compile error says.
		//
		// 3) Create another ArrayList of Integers.
		
		ArrayList<Integer> num = new ArrayList<Integer>(); 
			
		
		
		// 4) Add 10 random integers to the ArrayList using the add method
		
		   for (int i=0;i<10;i++) {
			   
			   num.add(((int)(Math.random()*101) ));
		   }
		
			
		
	
		
		
		// 5) Print out the contents of the ArrayList
			System.out.print(num.toString());
	
	}

}
