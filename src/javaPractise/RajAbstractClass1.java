package javaPractise;

class Calculator
{
	void calculate(int a)
	{
		System.out.println("Square:"+(a*a));
	}
	void add(int a, int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	
}

public class RajAbstractClass1 {

	public static void main(String[] args) {
	Calculator c1 = new Calculator();
	c1.calculate(10);
	c1.add(10,20);
	Calculator c2 = new Calculator();
	c2.calculate(20);
	}
	
	public void test(){
		
	}

}
