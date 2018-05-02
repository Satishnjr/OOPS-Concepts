package AbstractionConcept;

public abstract class Bank {

	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;

	//abstract class is partial abstraction
	//hiding the implementation logic -- is called Abstraction(OOP Concept)
	//implementation logic will be defined by the respective Child Classes acc to their requ's
	//abstract class can have abstract methods & non-abstract methods
	//cannot create the object of abstract classes
	//abstract class can have default, final & static variables
	
	
	public abstract void loan();  //abstract method -- no method body

	//non-abstract methods -- have methods body
	public void credit() {
		System.out.println("Bank-----------Credit");
	}

	public void debit() {
		System.out.println("Bank-----------Debit");
	}
}
