package Testing;

public class UnionBank 
{

	public static void main(String[] args) 
	{
		adhaar(123456789123l);
//		pan("ysidf34");
		
		
    }
   
	 static long    adhaar(long    hi)
	 {
//		 long x = 12;
//		 for(x=12; x!=12; x++)
//		 {
//			 x++;
//			 
//		 }
//		
	 if(hi==12)
		 {
		 System.out.println("The AdhaarNumber of customer is :"+hi); 
		 }
	 else {
		 System.out.println("your not eligible");
	 }
		
		return 12l;
	 }
	 static String pan(String hello)
	 {
		 System.out.println(hello);
		 return hello;
	 }
	 static boolean eligible(boolean world)
	 {
		 System.out.println(world);
		 return true; 
	 }
	 static int age(int bye)
	 {
	   if(bye>=18)
	   {
		   System.out.println("your eligible");
		   return 20;
	   }
	   else
	   {
		   System.out.println("not eligible");
		   return 30;
	   }
	 }
}

