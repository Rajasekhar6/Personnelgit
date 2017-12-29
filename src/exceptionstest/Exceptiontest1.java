package exceptionstest;

public class Exceptiontest1 {


	public static void test1()
	{
		try{
		System.out.println("RAJA");
		Thread.sleep(2000);
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
	
		
		test1();
		

	}

}
