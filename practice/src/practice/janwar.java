package practice;

//Example of Hierarchical Inheritance

public class janwar {
	void eat() {
		System.out.println("Eating..");
	}
}

class Doggy extends janwar {
	void bark() {
		System.out.println("Barking...");
	}
}

class Cat extends janwar {

	void meow() {
		System.out.println("Meowing...");
	}
}

class HierarchicalInheritance{

	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		
		Dog d = new Dog();
		d.bark();
		d.eat();

	}

}
