package collectionExamples;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("RollNo1", 10);
		hm.put("RollNo2", 20);
		System.out.println(hm);
		
		System.out.println("Using Iterator");
		Iterator it = hm.keySet().iterator();
				
		while(it.hasNext())
		{
			String s = (String)it.next();
			System.out.println(s + " " + hm.get(s));
		}
		
	}

}
