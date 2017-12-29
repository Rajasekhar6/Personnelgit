package collectionExamples;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap1 {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("ClassA", 10);
		hm.put("ClassB", 20);
		
		System.out.println(hm);
		
		Iterator it = hm.keySet().iterator();
		
		while(it.hasNext())
		{
		String s = (String)it.next();
		System.out.println(s+" " + hm.get(s));
//		System.out.println(it.next());  // It will give only Key name, values are not displayed
		}

	}

}
