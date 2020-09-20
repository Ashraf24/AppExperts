package apollo.exercises.ch06_classes;

public class ArrayCalculator {
	
	static int sum=0;

	static float avg=0;
	
 public static int sum(int[] x)
 {
	int []y=x;
	 
  for (int i:y) {
	sum+=i;
	
}
	
	
	return sum; 
	 
 }
 
 public static float avg(int[] x)
 {
	  int []y=x;
	 
	  for (int i:y) {
		int total=0;
		 total+=i;
		 avg=total/y.length;	 
	  }
	  

	return avg;
	 
	 
 }

public static void printSumandAvg() {
	
	System.out.println("The sum: "+sum);
	System.out.println("The average: "+avg);
	
	
	
}}
 
 
 


