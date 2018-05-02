package InheritanceOverridingPolymorphism;

public class TestCar {

	public static void main(String[] args) {

		//static polymorphism --- compile-time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		System.out.println("*************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*************");
		
		//Top Casting -- moving small thing to big(child can be moved to parent)
		Car c1 = new BMW(); //dynamic polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		//without downcasting -- it will give error
		//BMW b1= new Car();   -->creating Car class Object using child class ref
		
		//downcasting -- big to small(parent cannot be moved to child), so we have to cast BMW to Car Object
		BMW b1= (BMW) new Car(); // this is downcasting   --> it will give classcastException in run time,
		                                                       // bcoz car cannot cast to BMW, this is not allowed
	}
	 
	
	

}
