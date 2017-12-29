package Pack1;

public class StringTest {

	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = "java";
		String s4 = "java";
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println();
		System.out.println(s1 == s2); // false
		System.out.println(s3 == s4); // true
		System.out.println(s1==s3);  // comparing one object and String Variable, it will give false, Note : if we compare with 
		                             // == with atleast one object it will always compare with adress of the ref variable, so it will 
		                             // false.    
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(s4));
	}

}
