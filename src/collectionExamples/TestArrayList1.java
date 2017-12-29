package collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class TestArrayList1 {

	public static void main(String[] args) {
		int i=0;
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add(30);
		a2.add(10);
		
		System.out.println(a2);
		
		ArrayList a1 = new ArrayList(a2);
		LinkedList a3 = new LinkedList(a2);
		Set a4 = new HashSet(a2);
		HashSet t2= new HashSet();
		Set t3 = Collections.synchronizedSet(a4);
		Set t4 = Collections.synchronizedSet(t2);
		System.out.println(a4);
		List l = Collections.synchronizedList(a1);
		ArrayList t = (ArrayList)l;
		System.out.println(t);
		
		ListIterator lt= a3.listIterator();
		
		System.out.println("Using Iterator");
		
		Iterator it = a2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			if(i==1)
			{
			it.remove();
			}i++;
			
		}
		
		System.out.println(a2);

	}

}
