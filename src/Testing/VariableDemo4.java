package Testing;

public class VariableDemo4 
{

	public static void main(String[] args) 
	{
		System.out.println("main method of VariableDemo4");
		funB();
		System.out.println("done");
		
	}

	static void funA()
	{
		System.out.println("funA of  VariableDemo4");
	}
	static void funB()
	{
		funA();
		System.out.println("funB of VariableDemo4");
		
	}
}
