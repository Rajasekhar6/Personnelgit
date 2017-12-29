package oops;

abstract class Sekhar {

	abstract void Run1();
}

public class Raja extends Sekhar{
	void Run1() {
		System.out.println("This is the abstract metbod implementiaon");
	
	}
	public static void main(String[] args) {
		Raja sek = new Raja();
		sek.Run1();
	}

}
