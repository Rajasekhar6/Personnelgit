package SeleniumPractice;

public class Statictest1 {

	static int k = 10;
 int j = 20;
	
	public void test1()
	{
		System.out.println("This is non static");
	}
	
	public static void main(String[] args) {
	
		int k = 20;
		System.out.println(k);
		System.out.println(Statictest1.k);
		
		Statictest1 st2 = new Statictest1();
		st2.k=50;
		
		System.out.println("printing static k             : "  + st2.k);
		
		Statictest1 st = new Statictest1();
	System.out.println("print j" + st.j);
	
	Statictest1 st1 = new Statictest1();
	st1.j=40;
	System.out.println("print st1        :" +st1.j);
		
	//	System.out.println(j);
		
		
		
		
		
		
		

	}

}
