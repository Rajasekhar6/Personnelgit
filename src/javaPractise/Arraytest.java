package javaPractise;

public class Arraytest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = new int[]{10,10,10};
		
		int sum =1;
		
		for(int i =0;i<a.length;i++)
		{
			sum = sum * a[i];
		}
		System.out.println(sum);
		
		
	}

}
