package apollo.exercises.ch08_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4_RemoveOdd {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		
		// Create a method called removeOdd
		// Remove all the odd numbers from an ArrayList 

		
		
		// removeOdd(Arrays.asList(1,2,3,5,8,13,21)) => {2, 8}
	    // removeOdd(Arrays.asList(7,34,2,3,4,62,3)) => {34, 2, 4, 62}
		
		ArrayList<Integer>list= new ArrayList<Integer>(Arrays.asList(34, 2, 4, 62));
		  
		removeOdd(list);
				

	}
	
	
	
public static void removeOdd(ArrayList<Integer> list) {
		
	 List<Integer> toRemove = new ArrayList<>();

     for (int si : list) {
         if (si % 2 != 0) { toRemove.add(si); }
     }

     list.removeAll(toRemove);
	 
	
	
	System.out.print(list);
		
		
	}

	
}

