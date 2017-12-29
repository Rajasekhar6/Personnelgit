package Pack1;

public class Arraytest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

int a[] = new int[3];
		a[0]=40;
		a[1]=20;
		a[2]=30;
				
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
		
			if(min>a[i])
			min=a[i];
	  }

		System.out.println(min); 
	}		
	
	}


