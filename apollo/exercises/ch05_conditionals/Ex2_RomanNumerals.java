package apollo.exercises.ch05_conditionals;

public class Ex2_RomanNumerals {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {
		// Call the method and verify it prints the correct roman numeral
		printRoman(-2);	

	}
	
	// Create a method that takes a number between 1-10
	// and prints the equivalent roman numeral.
	//
	// You should check to make sure the number passed
	// in isn't greater than 10.  If it is, print an
	// error.
	//




public static void printRoman(int n) 
{
	if (n>10||n<1)
	{System.out.print("error");}
	
	else {
  if (n==1)
  {
	  System.out.println("I");
  }
	 
  if (n==2)
  {
	  System.out.println("II");
  }
   
  if (n==3)
  {
	  System.out.println("III");
  }
  

  if (n==4)
  {
	  System.out.println("IV");
  }
	 
  if (n==5)
  {
	  System.out.println("V");
  }
   
  if (n==6)
  {
	  System.out.println("VI");
  }
  

  if (n==7)
  {
	  System.out.println("VII");
  }

  if (n==8)
  {
	  System.out.println("VIII");
  }
  
   

  if (n==9)
  {
	  System.out.println("IX");
  }

  if (n==10)
  {
	  System.out.println("X");
  }
}

}
  
   
  

}



/*
 * SAMPLE OUTPUT:
 * 
 * II
 * IV
 * X
 * 
 */