package oops;

//public class A

public class A {

	void m1()
	{
		System.out.println("Class A Method");
	}
}
	class B extends A
	{
		int k = 10;
	
public static void main(String[] args) {
	
	B obj = new B();
	obj.m1();
	}		
}



