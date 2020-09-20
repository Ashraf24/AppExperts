package apollo.exercises.ch09_advanced;
import java.util.ArrayList;



public class House {
	
	
	private Alarm [] alarms=new Alarm[10];
	
	
	House( )
	{
	
	Alarm[]alarms=new Alarm[2];
	Dog d=new Dog(34, "female");
	SecuritySystem ss=new SecuritySystem();
		alarms[0]=d;
		alarms[1]=ss;
		
		
		
	}
	
	
	public void setAlarmsEnabled(Alarm b)
	{
		
		for (int i=0;i<alarms.length;i++)
		{
			alarms[i]=b;
			
		}
		
	}



}
