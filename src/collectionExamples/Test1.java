package collectionExamples;

import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("b");
		al.add(1);
		al.add(1,"b");
		al.add(1,2);
		al.add(3,"");
		
		System.out.println(al);

	}

}
