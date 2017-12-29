package Pack1;

public class Primenoexe1 {

	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter n numbers");
		int n = scn.nextInt();
		int flag = 0;
		for(int i=2;i<n;i++)
		{
			if(n%i == 0 )
			{
				flag=1;
				break;
			}
		}
			if(flag==0)
			{
				System.out.println(n + " is prime no");
			}else
			{
				System.out.println(n + "is a not prime no");
			}
			
	}
	}

