package srishti;

class TestCons
{
	public TestCons(){
		System.out.println("hi from constructor body");
}
	public TestCons(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
public class constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCons(12,13);
		}
}
