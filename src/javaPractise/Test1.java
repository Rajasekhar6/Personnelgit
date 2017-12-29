package javaPractise;

public class Test1 {

	public int add(int a,int b)
	{
		int c = a +b;
		return c;
	}
	public int add(int a,int b,int c)
	{
		int d = a + b + c;
		return d;
	}
	public static void main(String[] args) {
		
		
		Test1 t1 = new Test1();
		int e = t1.add(4, 4);
		System.out.println("sum of a and b     " + e);
		
	}

}
