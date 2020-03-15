//NumberFormatException
class expdemo2
{
	void func1()
	{
		String var="102";
		int res=Integer.parseInt(var)
		System.out.println(res+5);
	}
	public static void main(String[]arr)
	{
		expdemo1 obj=null;
		obj=new expdemo1();
		obj.func1();
	}
}