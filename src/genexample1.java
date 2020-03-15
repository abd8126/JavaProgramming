//generic example using Integer value
import java.util.*;
class genexample1
{
	void func()
	{
		List <Integer>ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		//ls.add("")
		System.out.println(ls);
	}
	public static void main(String arr[])
	{
		genexample1 obj = new genexample1();
		obj.func();
	}
}