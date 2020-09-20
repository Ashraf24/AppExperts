package apollo.exercises.ch04_loops;

public class Ex5_ShiftLeft {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
	  // Call shiftLeft and print out the result with a few different arrays.
	  int []a= {23,32,43,4};
		int []b= {1,2};
		int[]c= {1};

	    //shift left
	for (int k:shiftLeft(a))
	{
		System.out.print(k+" ");
		
	}
	// Create a method called shiftLeft
    // Return an array that is "left shifted" by one -- 
	// so {6, 2, 5, 3} returns {2, 5, 3, 6}. Y
	// You may modify and return the given array, or return a new array. 
	
	// shiftLeft(a); // => {2, 5, 3, 6}
	// int b = {1, 2};
	// shiftLeft(b); // => {2, 1}
	// int c = {1};
	// shiftLeft(c); // => {1}
}	  
 
	
public static int[] shiftLeft(int a[]) {
	

	int tmp=a[0];
   
		  for (int i=0;i<a.length-1;i++) 
		  {
			 a[i]=a[i+1];
			  
		  }	
		a[a.length-1]=tmp;	  
		
		
	
	return a;
		
}}
	

/*
 * SAMPLE OUTPUT:
 *  
 * {2, 5, 3, 6}
 * {2, 1}
 * {1}
 *  
 */