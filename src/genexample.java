//generic example using String value
import java.util.*;
class genexample
{
	void func()
	{
		List <String>ls=new ArrayList<String>();
		ls.add("Mango");
		ls.add("Banana");
		ls.add("Lichi");
		ls.add("Papaya");
		ls.add("Apple");
		//ls.add("")
		System.out.println(ls);
	}
	public static void main(String arr[])
	{
		genexample obj=new genexample();
		obj.func();
	}
}