package oops;

public class SuperTest1 {

	/*SuperTest1()
	{
		System.out.println("Default constructor");
	}*/
	
	SuperTest1(int a)
	{
		System.out.println("Explicit constructor");
	}
		
	public static void main(String[] args) {
		
		R it = new R();
		}
}
	class R extends SuperTest1
	{
		R()
		{
			super(3);
			System.out.println("Q constructor");
		}
	}
	

