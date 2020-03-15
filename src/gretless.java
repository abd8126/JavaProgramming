import java.util.*;
class gretless extends Exception
{
	gretless()
	{
		System.out.println("num is same ");
	}
}
class userexe
{
	public static void main(String []arr)
	{
		
		
		try
		{
			System.out.println("enter two values");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a<b)
			{
				System.out.println(a+ " is greater");
			}
			else
			{
				System.out.println(b+" is greater");
			}
		}
		catch (gretless gl)
		{
			System.out.println(gl);	
		}
		finally 
		{
			System.out.println("enter ther next two num");
		}
	}
}