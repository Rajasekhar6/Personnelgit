package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		
		//ArrayList a1 = new ArrayList();
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("Raja");
		a1.add('A');
		a1.add("Raja");
		a1.addAll(a1);
		a1.add(10, "Lakshman");
		
		System.out.println(a1.indexOf("Raja"));
		System.out.println(a1.lastIndexOf("Raja"));
		System.out.println("Using Contains");
		System.out.println(a1.contains("Raja"));
		System.out.println(a1.containsAll(a2));
		
		
		System.out.println(a1);
		
		//
		System.out.println(a1.size());
		a1.remove(new Integer(10));
		a1.remove(3);
		System.out.println(a1);
		System.out.println(a1.containsAll(a1));
		
		System.out.println("+++++++++");
		
		System.out.println(a1.get(1));
		
		System.out.println("Using Iterator");
		
		Iterator i1 = a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("Using Enumerator");
		
		
		
		
//		System.out.println("Using clear++++++++");
//		a1.clear();
//		System.out.println(a1);
		
		//a1.removeAll(a1);
		System.out.println(a1.removeAll(a1));
		
		
		
		
//		for(;i1.hasNext();){
//			System.out.println(i1.next());
//		
//		}
	
	}

}
