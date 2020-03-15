class constractor2
{int x;
	constractor2()
	{
		System.out.println("non para constractor2");
	}
	constractor2(int a)
	{
		x=a;
		System.out.println("para constractor2");
	}
	public static void main(String arr[])
	{
		constractor2 con=new constractor2();
		constractor2 con1=new constractor2(15);
		System.out.println(con1.x);
	}
}