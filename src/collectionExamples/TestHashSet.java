package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;


public class TestHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(200);
		hs.add(200);
		hs.add(300);
		hs.add(300);
		hs.add(400);
		
		System.out.println(hs);
		
		System.out.println("Using Iterator");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
				System.out.println(it.next());
					}

	}
}

