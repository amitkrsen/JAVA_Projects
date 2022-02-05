package test_1;

import java.util.Scanner;

public class fibonacchi {

	public static void main(String[] args) {

		int i = 1, n, num1 = 0, num2 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term: ");
		
		n = sc.nextInt();
		System.out.println("Fibonacchi series of term "+n+" is");
		
		while (i <= n) { //1 2 3 4 5
			System.out.print(num1 + " "); // 0 1 1 2 3  
			int num3 = num1 + num2; // 1 2 3 5
			num1 = num2; // 1 1 2 3
			num2 = num3; // 1 2 3 5
			i++; // 2 3 4 5
		}
			
	}

}
