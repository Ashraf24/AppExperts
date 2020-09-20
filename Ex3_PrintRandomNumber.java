package apollo.exercises.ch03_methods;

import java.util.Random;

// The program that can print random numbers
public class Ex3_PrintRandomNumber {

  // This is the main method that is executed as
  // soon as the program starts.
  public static void main(String[] args) {

    // Create a method that returns a random number
    // between min and max.
    //
    // PrintRandomNumber(int min, int max)
    //
    // Save the return value in a variable and print
    // the random number.
    //
    // HINT: To generate a random number from 0 to 40:
  
	  int random=printRandomNumber(34,23);
  
	  System.out.print("My random number is "+random );
  }
  



  public static int printRandomNumber(int min, int max){
	    int x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	    }

  
  
}

/*
 * SAMPLE OUTPUT:
 *  
 *   My random number is 13
 *   My random number is 78
 *   
 */