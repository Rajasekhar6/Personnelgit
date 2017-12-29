package oops;

public class SuperTest2 {

	void s1()
	{
		System.out.println("This is s1 method");
	}
	
	public static void main(String[] args) {
		
		SuperTest3 s3 = new SuperTest3();
		s3.s1();
		s3.s2();
	}
}
	class SuperTest3 extends SuperTest2
	
	{
		void s2()
		{
			System.out.println("This is s2 method");
		}
	}
	