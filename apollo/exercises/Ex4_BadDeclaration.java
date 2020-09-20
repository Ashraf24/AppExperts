package apollo.exercises.ch02_variables;

// This is a program that has a few compile errors.
// See if you can fix the errors and run the program.
public class Ex4_BadDeclaration {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// This program creates a bunch of meaningless
		// integers, but it shows how you declare multiple
		// integers in a single line, or assign a variable
		// in the same line that you declare it.
		//
		// There are a couple of compile errors.  See if you
		// can find and fix the problems.
		
		// Start by uncommenting and fixing all the lines below
		
		int d = 3;
	    int x = 3;
		int e=4;
	    int y = x * 4;
		int a = 10;
		int b = a;
		int c = a + b;
		x = 4;
			
		x = x + d;
		
		
	
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}

}
