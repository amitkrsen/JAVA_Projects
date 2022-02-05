package practice;

public class Salary {
	
	float salary = 40000;
}

class Programmer extends Salary {
	int bonus = 4000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("The salary of the Programmer is: "+p.salary);
		System.out.println("The bonus of the Programmer is: "+p.bonus);

	}

}
