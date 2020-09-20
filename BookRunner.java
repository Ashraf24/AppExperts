package apollo.exercises.ch06_classes;

public class BookRunner {

	// This is the main method that is executed as
	// soon as the program starts.	
	public static void main(String[] args) {

//	4) In the file, BookRunner.java:
//  a) Declare two book variables
//	b) Instantiate two book objects and set their fields.
//  c) Print descriptions of the book objects using their toString methods.
	
	
		
// Book c=new Book("Karim","Physics",43,4);
 
		User a=new User();
	Book b=new Book("Rahid",a,44,33);
 
    User c=new User();
    
   c.readBook(b); 
   
	
	
	/*
 b.author="Rahim";
 b.isbn=34;
 b.numPages=43;
 b.title="Camistry";
 */
 //System.out.print(c.toString());
 
 
 
		
		
	}

}
