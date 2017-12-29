package oops;

public class InheritanceTest {

	int k = 10;
	void test1()
	{
		System.out.println("test1 method");
	}

public static void main(String[] args) {

InheritanceTest it = new InheritanceTest();
it.test1();
InheritanceTest1 it1 = new InheritanceTest1();

it1.test1();
it1.test2();

}
}
	class InheritanceTest1 extends InheritanceTest
	{
		void test2()
		{
		
		}
		
}	
	


