package collectionExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedlist {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add("Raja");
		l1.addFirst("Sekhar");
		System.out.println(l1);
		
		System.out.println(l1.getLast());
		
		Iterator i1 = l1.iterator();
		while(i1.hasNext())
		{System.out.println(i1.next());}
		

	}

}
