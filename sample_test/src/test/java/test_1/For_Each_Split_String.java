package test_1;

public class For_Each_Split_String {
	
	public static void main(String[] args) {
	
		//There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
//		String [] cars = {"BMW", "Audi", "Marcedes", "Tesla", "Volvo"};
//		for(String i : cars)
//		{
//			System.out.println(i);
//		}
		
		//Split example with for-each
		String str = "Amit,Kumar,Sen";
		String arr[] = str.split(",");
		for (String i : arr)
		{
			System.out.println(i);
		}
		
		//split example with for
		String str1 = "BMW, Audi, Marcedes, Tesla, Volvo";
		String arr1[] = str1.split(", ",4);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
