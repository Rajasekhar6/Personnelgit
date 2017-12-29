package oops;

public class UpCasting {
	System.
void m1()
{
	System.out.println("m1() in first class");
}
}
class DD extends UpCasting
{
	void m2()
	{
		System.out.println("m2() in second class");
	}
}
class C extends DD
{
void m3()
{
	System.out.println("m3() in class c");

}
public static void main(String[] args) {
	System.out.println("Program Starts");
	UpCasting up = (UpCasting) new DD();
	up.m1();
	DD b1 = new C();
	b1.m1();
}
}