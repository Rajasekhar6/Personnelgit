package Pack1;

public class PrimenoProgram {

	public static void main(String[] args) {

		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter n numbers");
		int n = scn.nextInt();
		for(int j=2;j<n;j++)
		{		
		int flag = 0;
		for (int i = 2; i < j; i++)

		{
			if ((j % i) == 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(j + "is prime no");
		}
		else
		{
			System.out.println(j + "is not prime no" );
		}
		}
		
	}
}
