package apollo.exercises.ch07_inheritance;

public class Cat extends Animal{

	boolean lovesCatnip;
	
	public Cat(int cw,String cs, boolean b) {
		
		super(cw,cs);
		
	}
	
	/*Add an additional constructor in the Cat class that just initializes
	   weight and sex.  Should default isGuideDog to false and use the 
	   "super" keyword.
	   */
	
	public Cat(int cw, String cs) {
		
		super(cw, cs);
		
		
		
	}
	
	
	
	public void speak() {
		  System.out.println("Meow");
		}
	
}
