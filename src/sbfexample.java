class sbfexample
{
	void func()
	{
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("shiva");
		System.out.println(sb1);
		System.out.println("\n----------\n");
		sb1.append(sb2);
		System.out.println(sb1);
	}
	public static void main(String args[])
	{
		sbfexample obj=new sbfexample();
		obj.func();
	}
}