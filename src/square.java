import java.util.*;
class squareException extends Exception
{
	squareException()
	{
		System.out.println("enter positive no");
	}
	
}
class userException
{
	public static void main(String args[])
	{
		try{
			int n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			if(n>0)
			{
				int m=n*n;
				System.out.println(m);
			}
			else
			{
				throw new squareException();
			}
			
		}
		catch(squareException sq)
		{
			System.out.println(sq);
		}
		finally
		{
			System.out.println("enter new no.");
		}
	}
}