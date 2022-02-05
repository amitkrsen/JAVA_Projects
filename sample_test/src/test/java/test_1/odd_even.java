package test_1;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		int rem = n % 2;
		
		if (rem != 0)
			System.out.println(n+" is an Odd Number");
		else
			System.out.println(n+" is an Even Number");

	}

}
