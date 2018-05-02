package InterfaceConcept;

public interface Car {
	
	//only final & static variables
	int wheels = 4;
	
	//Always defines only abstract methods
	//no method body
	//only method declaration
	//Here we achieve 100% Abstraction
	//cannot create the object of interface
	
	public void start();
	public void stop();
	public void refuel();

}
