package Pack1;

public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Program Starts");
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int n = scn.nextInt();

		switch (n) {
	    
		default :
			System.out.println("I am first");
		//break;
		case 1: {
			System.out.println("Monday");
		}
		case 2:
			System.out.println("Tuesday");
			
		
		}
	}

}
