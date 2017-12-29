package exceptionstest;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class testCheckedException {

	public static void main(String[] args) //throws FileNotFoundException
	{
		
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
		pw.close();	

	}

}
