package InheritanceOverridingPolymorphism;

public class BMW extends Car{  //has-a relationship
	
	//overridden method
	public void start() {
		System.out.println("BMW------Start");
	}
	
	//BMW own method
	public void theftSafety() {
		System.out.println("BMW------theft Safety");
	}
	

}
