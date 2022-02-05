package test_1;

import java.util.Scanner;

public class chkPalindrome {

	public static void main(String[] args) {
		
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		
		int length = str.length();
		
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		
		System.out.println(rev);
		
		if (str.equals(rev))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
		
	}

}
