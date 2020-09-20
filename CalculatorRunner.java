package apollo.exercises.ch06_classes;



public class CalculatorRunner {


	public static void main(String[] args) {
	
	int []a=new int[10];
	
	for (int i=0;i<a.length;i++)
	{
	a[i]=(int)(Math.random()*101);	
	}
	
	ArrayCalculator a1=new ArrayCalculator();
	
	a1.sum(a);
	a1.avg(a);
	a1.printSumandAvg();
   

	
	
	}

}
