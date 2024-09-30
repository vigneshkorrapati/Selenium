package Testing;


public class MethodDemo
{
	
  int x,y;
  void fun1(){
	   x = x+1;
	   MethodDemo m1 = new MethodDemo();
	   m1.x = x+2;
	   System.out.println(m1.x);
	   System.out.println(x);
  }

	public static void main(String[] args) 
	{
		MethodDemo m1 = new MethodDemo();
		m1.fun1();
		
  }
}