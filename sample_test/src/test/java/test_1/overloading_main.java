package test_1;

public class overloading_main {
	
	
	
	public static void main(boolean args) {
		
		if (args) {
			System.out.println("main() overloaded"
                    + " method 1 Executing");
			System.out.println(args);
			
			overloading_main.main("Amit", "Sen");
		}
		
	}
	
	public static void main(String a, String b) {
		
		System.out.println("main() overloaded"
                + " method 2 Executing");
		System.out.println(a+" "+b);
		
	}
	
	public static void main(int args) {
		
		System.out.println("main() overloaded"
                + " method 3 Executing");
		System.out.println(args);
		
	}

	public static void main(String[] args) {

		System.out.println("Original main()"
                + " Executing");
		System.out.println("Hello");
		
		overloading_main.main(true);
		overloading_main.main(123456);

	}

}
