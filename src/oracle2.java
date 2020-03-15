//parametrised constractor inheretance with using super mathod
class SM
{
	SM()
	{
		System.out.println("base.... non para SM");
	}
	SM( int a)
	{
		System.out.println("base.... para SM");
	}
}
class oracle2 extends SM
{
	oracle2()
	{
	
		/*drived class parametrised cont does not call the base class parametrised const therefore java provides super() method for calling base class parametrised cont 
		System.out.println("derived.... non para const");*/
	}
	oracle2(int x)
	{
		super(10);
		System.out.println("derived.... para const");
	}
	public static void main(String arr[])
	{
		oracle2 obj =new oracle2();
		oracle2 obj1 =new oracle2(10);
	}
}