package test_2;

public class EncapClsTwo {

	public static void main(String[] args) {
		
		EncapClsOne obj = new EncapClsOne();
		
		obj.setAge(33);
		obj.setName("Amit Kumar Sen");
		
		System.out.println("My Name is: "+obj.getName());
		System.out.println("My Age is: "+obj.getAge());
		
	}

}
