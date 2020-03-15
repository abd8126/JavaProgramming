//expection handling
class expdemo
{
	void func1()
	{
		try
		{
			int  var1=10;
			int var2=0;
			int res=var1/var2;
			System.out.println("try block...... Division"+res);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Check block....... Prob Occur");
		}
	}
	void func2()
	{
		System.out.println("Second func ");
		
	}
	public static void main(String []arr)
	{
		expdemo obj=new expdemo();
		obj.func1();
		obj.func2();
	}
}