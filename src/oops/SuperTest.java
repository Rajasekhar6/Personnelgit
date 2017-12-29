package oops;

public class SuperTest {

	SuperTest() {
		System.out.println("Super test ctt");
	}

	public static void main(String[] args) {

		Q sup = new Q();
	}
}

class Q extends SuperTest {
	Q() {
		//super()
		System.out.println("Q test ctt");
	}
}
