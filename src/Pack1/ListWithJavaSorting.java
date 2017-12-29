package Pack1;

import java.util.ArrayList;
import java.util.Collections;

public class ListWithJavaSorting implements Comparable{
	private int test = 0;
	
	public String toString(){
		return test + "";
	}
	
	public int compareTo(Object o){
		int currentVal = this.test;
		int secondVal = ((ListWithJavaSorting)o).test;
		if(currentVal <= secondVal){
			return -1;
		}else{
			return 0;
		}
	}
	
	public static void main(String args[]){
		//ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList a = new ArrayList();
		ListWithJavaSorting l = new ListWithJavaSorting();
		l.test = 10;
		ListWithJavaSorting l1 = new ListWithJavaSorting();
		l1.test = 30;
		ListWithJavaSorting l2 = new ListWithJavaSorting();
		l2.test = 20;
		
		
		a.add(l);
		a.add(l1);
		a.add(l2);
		//System.out.println(l);
		System.out.println(a);
		Collections.sort(a);
		//Collections.
	System.out.println("After sorting" +a);
		/*for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}*/
		
		// To reverse an arraylist
		Collections.reverse(a);
		System.out.println("Afdter reversing"+a);
	}

}
