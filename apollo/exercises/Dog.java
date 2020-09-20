package apollo.exercises.ch09_advanced;

import apollo.exercises.ch07_inheritance.Animal;
import apollo.exercises.ch09_advanced.Alarm;

public class Dog extends Animal implements Alarm{
	
	
	private boolean alarmEnabled;
	
	public void setAlarmEnabled(boolean enabled, String password)
	{
	System.out.print("Dog is on alert");	
		
	}
	
	
	
	
	boolean isGuideDog=false;
	
	
	public Dog(int dw, String ds, boolean b) {
	
		super(dw, ds);
		
		this.isGuideDog=b;
		
		
	}
	
	/*Add an additional constructor in the Dog class that just initializes
	   weight and sex.  Should default isGuideDog to false and use the 
	   "super" keyword.
	   */
	
	public Dog(int dw, String ds) {
		
		super(dw, ds);
		
		
		
	}
	
	
	public void speak(int numTimes)
	{
	for (int i=0;i<numTimes;i++)
		{speak();
		}
	}
	
	
	public void speak() {
		  System.out.println("Woof");
		}

	
	

	
}
