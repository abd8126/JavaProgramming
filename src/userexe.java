//user defined Exception(costum Exception) with using try catch finally
class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("under 18 problem");
	}
}
class userexe
{
	public static void main(String []arr)
	{
		try
		{
			int age=Integer.parseInt(arr[0]);
			if(age>=18)
			{
				System.out.println("vote done");
			}
			else
			{
				throw new AgeException();
			}
		}
		catch (AgeException ae)
		{
			System.out.println(ae);	
		}
		finally 
		{
			System.out.println("next voter will come");
		}
	}
}