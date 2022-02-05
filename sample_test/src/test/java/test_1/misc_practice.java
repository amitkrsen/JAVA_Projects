package test_1;

import java.util.Scanner;

public class misc_practice {

	public void concat() {

		String str1 = "Amit";
		String str2 = "Kumar";
		String str3 = "Sen";
		
		String name = str1.concat(str2).concat(str3);
		System.out.println(name);
	}

	public void palindrome() {

		String str, rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		int length = str.length();
		
		for(int i = length - 1; i >=0; i--)
			rev = rev + str.charAt(i);
			System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("It is a Palindrome...");
		}
		else
		{
			System.out.println("It is not a Palindrome...");
		}
	}

	public void upperCase() {

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++)
		{
			char txt = str.charAt(i);
			if(Character.isUpperCase(txt))
			{
				System.out.print(txt);
			}
		}
	}

	public void fibonachhi() {

		int i = 1, n, num1 = 0, num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term: ");
		n = sc.nextInt();
		
		System.out.println("Fibonacchi series of term "+n+" is: ");
		
		while(i < n)
		{
			System.out.print(num1+" ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			i++;
		}

	}

	public static void main(String[] args) {

		misc_practice mp = new misc_practice();
//		mp.concat();
//		mp.palindrome();
//		mp.upperCase();
		mp.fibonachhi();

	}

}
