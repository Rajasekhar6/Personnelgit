package Pack1;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Starts");
java.util.Scanner scn = new java.util.Scanner(System.in);
System.out.println("Enter No :");
int n = scn.nextInt();
int j=1;
for (int i=1;i<=n;i++)
{
	j=j*i;

	}
System.out.println("Factorial of given no's is:   " +  j);
}
}
