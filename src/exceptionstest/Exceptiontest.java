package exceptionstest;

public class Exceptiontest {


	public static void dostuff()
	{
			System.out.println("do stuff");
			domorestuff();
	}
	
		public static void domorestuff()
		{
			try
			{
			int i = 10/0;	
			}
			catch(ArithmeticException e)
			{
	int i = 10/2;
	System.out.println(i);
			}
			//System.out.println("domore stuff");
		}
	
	
	public static void main(String[] args) {

		dostuff();
		
		}

}
