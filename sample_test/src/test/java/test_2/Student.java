package test_2;

public class Student {
	
	int rollno;
	String name;
	float fee;
	
	Student(int rollno, String name, float fee)	{
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	void display() {
		
		System.out.println(rollno+" "+name+" "+fee);
	}

	public static void main(String[] args) {
		
		Student s1 = new Student(111, "Ankit", 5000);
		Student s2 = new Student(222, "Subir", 6500);
		s1.display();
		s2.display();

	}

}
