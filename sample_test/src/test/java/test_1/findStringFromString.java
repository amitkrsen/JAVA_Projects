package test_1;

public class findStringFromString {

	public static void main(String[] args) {

		String searchMe = "Showing 1 – 24 of 12,393 results for mobiles";
		String findMe = "mobiles";

		int searchMeLength = searchMe.length();
		int findMeLength = findMe.length();

		boolean foundIt = false;

		for (int i = 0; i <= searchMeLength - findMeLength; i++)
		{
			if (searchMe.regionMatches(i, findMe, 0, findMeLength))
			{
				foundIt = true;
				System.out.println(searchMe.substring(i,i + findMeLength));
				break;
			}
		}
		if (!foundIt)
			System.out.println("No match found.");

	}

}
