package Testing;


public class Odemo10 
{
	A getA(int x)
	{
		A a1 = new A();
		a1.i=x;
		a1.j=x+1;
		return a1;
	}

	public static void main(String[] args) 
	{
		Odemo10 o1 = new Odemo10();
		A x = o1.getA(4);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		
	}

}
