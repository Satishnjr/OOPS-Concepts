package TestMain;

public class TestMainMethod {

	public static void main(String[] args) {    // array type string parameter
		System.out.println("A---Main Method");
       
		main("Testing");
		main(10);
		main(10, 20);
	}
	
	public static void main(String args) {     // normal type string parameter
		System.out.println("B---Main Method");

	}
	
	public static void main(int a) {
		System.out.println("C---Main Method");

	}
	
	public static void main(int a, int b) {
		System.out.println("D---Main Method");

	}

}
