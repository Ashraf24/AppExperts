package apollo.exercises.ch03_methods;

// This is a program that prints out your basic info
public class Ex1_BasicMethod {

	// This is the main method that is executed as
	// soon as the program starts.
	public static void main(String[] args) {
		
		// Call the printBasicInfo method from the main method here
		
		 printBasicInfo("Ken Thomson", "ken@thompson.com");
		// Call the printBasicInfo method from the main method with different name and email
		 printBasicInfo("James Dean", " deanish@jim.com");

		
	}
	
	// Define a public static method called printBasicInfo which accepts a name and email.
    
	// printBasicInfo is a method that prints out a name and email.

public static void printBasicInfo(String name,String email) {
	
	String n=name;
	String e=email;
	
	System.out.println("Name: "+n+" | "+"Email: "+e);
	
		
	}
	
}

/*
 * SAMPLE OUTPUT:
 *  
 *   Name: Ken Thompson | Email: ken@thompson.com
 *   Name: James Dean | Email: deanish@jim.com
 *   
 */
