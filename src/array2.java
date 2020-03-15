//sum all element of an array by using for each loop 
class array2
{
	public static void main (String args[])
	{
		int sum=0;
		int ar[] = {10,20,30,40,50,60,70};
		//ar[0]=10;
		//ar[1]=10;
		//ar[2]=12;
		//ar[3]=14;
		//ar[4]=16;
		for(int var:ar)
		{
			System.out.println(var);
			sum=sum+var;
		}
		System.out.println("total="+sum);
	}
}