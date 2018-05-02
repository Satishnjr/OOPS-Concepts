package ClassNObjects;

public class Car {
	
   //class variables/global vars: 
	int mod;
	int wheels;

	public static void main(String[] args) {
		
	// new Car(); -- this is the object of Car Class
	// 'new' keyword is used to create the object
	// a,b,c --- Object reference variables
		
      Car a = new Car();
      Car b = new Car();
      Car c = new Car();
      
      a.mod = 2015;
      a.wheels = 4;
      
      b.mod = 2017;
      b.wheels = 6;
      
      c.mod = 2019;
      c.wheels = 8;
      
      System.out.println(a.mod);
      System.out.println(a.wheels);
      
      System.out.println(b.mod);
      System.out.println(b.wheels);
      
      System.out.println(c.mod);
      System.out.println(c.wheels);
	}

}
