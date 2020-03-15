//sum of all element of array which input cmd line args with using for each loop?
class loop
{
	public static void main (String args[])
	{
		int sum=0;
		for(String var:args)
		{
			int d=Integer.parseInt(var);
			sum=sum+d;
		}
		System.out.println(sum);
	}
}