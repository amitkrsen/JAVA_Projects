package test_1;

import java.util.ArrayList;

public class lamdaExp {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(12);
		numbers.add(8);
		numbers.add(9);
		
		numbers.forEach((n) -> {System.out.println(n);});
		
	}

}
