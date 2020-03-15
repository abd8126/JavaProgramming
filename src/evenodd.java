class evenodd extends Exception
{
	evenodd()
	{
		System.out.println("num is odd");
	}
}
class userexe extends ArrayIndexOutOfBoundsException
{
	public static void main(String []arr)
	{
		try
		{
			int num=10;
			int a=num%2;
			if(a==0)
			{
				System.out.println("num is even");
			}
			else
			{
				throw new evenodd();
			}
		}
		catch (evenodd eo)
		{
			System.out.println(eo);	
		}
		finally 
		{
			System.out.println("enter ther next num");
		}
	}
}