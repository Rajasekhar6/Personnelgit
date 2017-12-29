package Pack1;

public class SumOfNnumbers {

	public static void main(String[] args) {
		
		
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter n numbers");
		int n = scn.nextInt();
		int j=0;
		for(int i=1;i<=n;i++)
		{
			j=j+i;
			
		}
		
		System.out.println(j);

	}

}
