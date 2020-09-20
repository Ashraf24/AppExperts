package apollo.exercises.ch05_conditionals;

public class Ex5_CountEvens {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call countEvens a few times with different arrays and print the result
		
		
		int []a = {1,3,5};
		 countEvens(a);
		
	}
	
	// Create a method called countEvens
	// Return the number of even ints in the given array. 
	// Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1. 
	
	 
	 // countEvens(a); // -> 3
	// int b = {2, 2, 0};
	// countEvens(b); // -> 3
	// int c = { 1, 3, 5};
	// countEvens(c); // -> 0



public static void countEvens(int a[]) {
	
	int count=0;
for (int i=0;i<a.length;i++) {
	
	if (a[i]%2==0)
	{
	count++;	
		
	}
}
	
	System.out.print(count);
}

}
/*
 * SAMPLE OUTPUT:
 *  
 * 3
 * 0
 * 2
 *  
 */