//sorting a generic example using Integer value
import java.util.*;
class genexample2
{
	void func()
	{
		List <Integer>ls=new ArrayList<Integer>();
		ls.add(100);
		ls.add(20);
		ls.add(3);
		ls.add(15);
		ls.add(5);
		//ls.add("")
		System.out.println(ls);
		System.out.println("sorted list==");
		Collections.sort(ls);
		//Collections.sort(ls,Collections.reverseOrder());
		//Iterator itr=ls.iterator();
		//while(itr.hasNext())
		//{
			//System.out.println(itr.next());
		//}

	}
	public static void main(String arr[])
	{
		genexample2 obj = new genexample2();
		obj.func();
	}
}