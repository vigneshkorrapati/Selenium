package Testing;

public class VariableDemo1 
{

	public static void main(String[] args)
	{
     
      System.out.println("Main method");
      VariableDemo1 m1 = new VariableDemo1();
      m1.funB();
      System.out.println("done");
		
	}
	void funA()
	{
		 System.out.println("funA of class");
		
	}
	void funB()
	{
		 System.out.println("funB of class");
		 funA();
		
	}

}
