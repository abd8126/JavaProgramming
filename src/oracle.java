//non parameterised constractor
class SM
{
	SM()
	{
		System.out.println("base.... non para SM");
	}
}
class oracle extends SM
{
	oracle()
	{
		System.out.println("derived.... non para const");
	}
	public static void main(String arr[])
	{
		oracle obj =new oracle();
	}
}