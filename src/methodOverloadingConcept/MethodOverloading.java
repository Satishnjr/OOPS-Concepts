package methodOverloadingConcept;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}
	
	// we cannot create a method inside a method
	// duplicate methods -- i.e, same method name with same num of arguments
	// we can overload main method also
	public static void main(int i) {
		
	}
    public static void main(int p, int q) {
		
	}
	
	
	// method --> when the method name is same with diff args or input params within the same class

	public void sum() { // 0 inut parameter
		System.out.println("sum method – zero parameter");
		System.out.println();

	}

	public void sum(int i) { // 1 inut parameter
		System.out.println("sum method – one parameter");
		System.out.println(i);
	}

	public void sum(int j, int k) { // 2 inut parameter
		System.out.println("sum method – two parameter");
		System.out.println(j + k);
	}
}
