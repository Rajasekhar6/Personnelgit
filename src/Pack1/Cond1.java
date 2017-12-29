package Pack1;

public class Cond1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program Starts");
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int age = scn.nextInt();
		
		if((age>18) && ( age < 60))
		
		{
			System.out.println("Search for Girl");
			
		}
		else if (age> 60)
		{
			System.out.println("go to himalaya");
		}
		else
		{
			System.out.println("Go to school");
		}

	}

}
