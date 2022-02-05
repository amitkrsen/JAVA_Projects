package test_1;

import java.util.Scanner;

public class upperCase_char {

	public static void main(String[] args) {
		
		String txt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		txt = sc.nextLine(); 
		
		
		for(int i = 0; i < txt.length(); i++) {
			
			char str = txt.charAt(i);
			if(Character.isUpperCase(str))
			{
				System.out.print(str);
			}
			
		}

	}

}
