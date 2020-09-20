package apollo.exercises.ch05_conditionals;

public class Ex3_Blackjack {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		
		// Given 2 int values greater than 0, return whichever 
		// value is nearest to 21 without going over. 
		// Return 0 if they both go over. 
		//
		System.out.println(blackjack(3,4));
		
		System.out.println(blackjack(2,7));
		System.out.println(blackjack(12,9));
		System.out.println(blackjack(23,4));
		
		// Call the method a few times and print the results
	}
	
	// Create a method like:
	//   public int blackjack(int a, int b)
	//

	
	   public static int blackjack(int a, int b)
		
	   { int n=0;
		if (a>21 && b>21)
		{
			n=0;
        }
		
	   if (a<21)
		   {
			  if (a>b)
			  {
				n=a;  
			  }
			  else {
				  n=b;
			  }
			   
		   }
		
		   return n ;
		   
		   
	   }
	
	
}

/*
 * SAMPLE OUTPUT:
 * 
 * 6
 * 8
 * 0
 * 
 */