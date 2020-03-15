import java.util.*;
class listdemo
{
	void func()
	{
		List ls=new ArrayList();
		ls.add("pepsi");
		ls.add("maggiee");
		ls.add("500");
		ls.add("9.59");
		System.out.println(ls);
		System.out.println(ls.size()+"item");
		System.out.println(\n\n---------------\n\n"")
		//System.out.println(ls.get(1));
		//ls.set(1,"Dairy Milk");
		//ls.add(2,"Dairy Milk");
		//ls.remove(1);
		ls.clear();
		
		System.out.println(ls);
		System.out.println(ls.size()+"item");
		
	}
	public static void main(String args[])
	{
		listdemo obj=new listdemo();
		obj.func();
	}
}