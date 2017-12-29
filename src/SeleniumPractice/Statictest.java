package SeleniumPractice;

public class Statictest {

	static int i = 10;

	
	public static void main(String[] args) {
	
	//	int i = 20;
		Statictest st = new Statictest();
		st.i=20;
		Statictest st1 = new Statictest();
		st1.i = 40;
		
		System.out.println(i);
		System.out.println(Statictest.i);
		
		
	}

}
