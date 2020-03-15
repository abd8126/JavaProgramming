import java.util.*;
class Laptop implements Comparable<Laptop>
{
	int id;
	String company;
	int price;
	Laptop(int lid, String lcompany, int lprice)
	{
		
	}
	public int compareTo(Laptop lp)
	{
		//return
	}
}
class sorting
{
	void func()
	{
		List<Laptop> ls=new ArrayList<Laptop>();
		ls.add(new Laptop( 02,"dell",45000));
		ls.add(new Laptop( 04,"acer",25000));
		ls.add(new Laptop( 01,"HP",38000));
		ls.add(new Laptop( 03,"Lenovo",44000));
		//Collection.sort(ls);
		for(Laptop pl:ls)
		{
			System.out.println(pl);
		}
		
	}
	public static void main(String args[])
	{
		sorting obj=new sorting();
		obj.func();
	}
}
