package SeleniumPractice;

public class Integerparse {

	public static void main(String[] args) {

		String b = "10101";
		
		Integer i = Integer.parseInt(b,2);
		System.out.println(i);
		
		System.out.println(i.toBinaryString(50));
	}

}
