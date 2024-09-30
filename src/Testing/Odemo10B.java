package Testing;

public class Odemo10B 
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
		Odemo10B o1 = new Odemo10B();
		A x = o1.getA(4);
		int i = o1.getA(6).i;
		int a = o1.getA(6);
		A x2 = o1.getA(6).funA();
		A x3 = o1.getA(6).i;
		int b = o1.getA(6).funA();
		int c = o1.getA(6).i;
		
    }

}
