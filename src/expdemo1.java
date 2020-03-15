//NullPointerException
class expdemo1
{
	void func1()
	{
		System.out.println("fn is working");
	}
	public static void main(String[]arr)
	{
		expdemo1 obj=null;
		//obj=new expdemo1();
		obj.func1();
	}
}