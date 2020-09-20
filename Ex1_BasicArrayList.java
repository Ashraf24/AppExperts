package apollo.exercises.ch08_collections;

import java.util.ArrayList;
import java.util.Random;

public class Ex1_BasicArrayList {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Directions:
		
		// 1) Declare am ArrayList of strings
		ArrayList<String> names= new ArrayList<String>();
		
		// 2) Call the add method and add 10 random strings
		
 names.add("mithu");
 
 names.add("titu");
 names.add("shima");
 names.add("shikha");
 names.add("ruma");
 
 	    
		// 3) Iterate through all the elements in the ArrayList

 for (int i=0;i<names.size();i++)
 {
	 System.out.println(names.get(i));
 }


 // 4) Remove the first and last element of the ArrayList

 names.remove(0);
 names.remove(names.size()-1);
 
 
 // 5) Iterate through all the elements in the ArrayList, again.

System.out.println("after removal:");
 for (int i=0;i<names.size();i++)
 {
	 System.out.println(names.get(i));
 }
 
	}
	
	

}
