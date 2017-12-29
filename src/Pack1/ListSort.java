package Pack1;

import java.util.ArrayList;
import java.util.Collections;

public class ListSort {
	private int test = 0;
	
	public String toString(){
		return " This is my testing";
	}
	
	
	
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>();
				
		a.add(10);
		a.add(30);
		a.add(20);
		a.add(15);
		
		System.out.println(a);
		Collections.sort(a);
		
		System.out.println("After sorting" +a);
		// below for loop is not required as sop(a) will print all the elements in that arraylist when it has Integer elements. 
		/*for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}*/
		
		// To reverse an arraylist
		Collections.reverse(a);
		System.out.println("Afdter reversing"+a);
	}

}
