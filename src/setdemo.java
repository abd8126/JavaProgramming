import java.util.*;
class setdemo
{
	void func()
	{
		Set st=new HashSet();
		st.add("pepsi");
		st.add("maggiee");
		st.add(500);
		st.add(6.5);
		if(st.isEmpty())
		{
			System.out.println("no item");
		}
		else
		{
			System.out.println(st);
		System.out.println(st.size()+"item");
		}
		if(st.contains("pepsi"))
		{
			System.out.println(st);
		System.out.println("item found");
		}
		else
		{
			System.out.println("item not found");
		}
	}
	public static void main(String args[])
	{
		setdemo obj=new setdemo();
		obj.func();
	}
}