//constractor overloading prog
class constractor
{
	constractor()
	{
		System.out.println("non para constractor");
	}
	constractor(int a)
	{
		System.out.println("para constractor");
	}
	public static void main(String arr[])
	{
		constractor con=new constractor();
		constractor con1=new constractor(15);
	}
}