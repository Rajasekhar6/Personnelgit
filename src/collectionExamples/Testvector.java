package collectionExamples;

import java.util.Enumeration;
import java.util.Vector;

public class Testvector {

	public static void main(String[] args) {
		
		Vector vt = new Vector();
		vt.add(10);
		vt.add(1, 20);
		vt.addElement(30);
		System.out.println(vt);
		
		Enumeration em = vt.elements();
				
				while(em.hasMoreElements())
				{
					Integer it = (Integer)em.nextElement();
					System.out.println(it);
				}
				
		

	}

}
