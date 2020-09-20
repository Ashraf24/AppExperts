package apollo.exercises.ch07_inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal a1=new Animal(30,"female");
		
		Dog d1=new Dog(33,"male");
		Dog d2=new Dog(12,"female",true);
			

		Cat c1=new Cat(10,"male");
		
		Cat c2=new Cat(10,"male",false);
		/*
		a1.weight=34;
		a1.sex="female";
		
		d1.weight=3;
		d1.sex="female";
		
		c1.weight=45;
		c1.sex="female";
		d1.isGuideDog=true;
		
		c1.lovesCatnip=true;
	
		System.out.println("Animal: weight: "+a1.weight+" sex:"+a1.sex);

		System.out.println("Dog: weight: "+d1.weight+" sex:"+d1.sex+"is guide dog?:"+d1.isGuideDog);
		System.out.println("Cat: weight: "+c1.weight+" sex:"+c1.sex+ "Love Catnip: "+c1.lovesCatnip);
*/

	//	System.out.println("Dog: weight: "+d1.weight+" sex:"+d1.sex+" is guide dog? "+d1.isGuideDog);
	//	System.out.println("Dog: weight: "+d2.weight+" sex:"+d2.sex+" is guide dog? "+d2.isGuideDog);

//		System.out.println("Cat: weight: "+c1.weight+" sex:"+c1.sex+" is guide dog? "+d1.isGuideDog);
	//	System.out.println("Cat: weight: "+c2.weight+" sex:"+c2.sex+" lovesCatnip? "+d2.isGuideDog);
		
		//speak(d1);
		//speak(c1);
		System.out.println("before overriding method ");
	    
		 d1.speak();
		 System.out.println("after overriding method");
	      d1.speak(3);
}

	public static void speak(Animal animal) {
	  	  animal.speak();

}

	
}
