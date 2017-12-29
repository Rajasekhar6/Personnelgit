package Pack1;

public class Evenodd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts");
java.util.Scanner scn = new java.util.Scanner (System.in);
System.out.println("Enter number:");
int n = scn.nextInt();
if ((n%2) == 0)
{
	System.out.println(" Given no is Even");
}
else
{
	System.out.println("Given no is odd");
}
	}

}
