package Interfaces;

public class MyClass implements MyInterfaceTwo {

	public static void main(String[] args) {

		MyInterfaceTwo obj = new MyClass();
		obj.myMethodTwo();
	}

	public void myMethodOne() {

		System.out.println("Implementation of myMethodOne");
	}
	
	
	public void myMethodTwo() {
		
		System.out.println("Implementation of myMethodTwo");

	}

}

