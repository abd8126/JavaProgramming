//sum all element of an array by using for each loop 
class array3
{
	public static void main (String args[])
	{
		int count=0;
		int ar[] = {10,20,30,40,50,60,70};
		//ar[0]=10;
		//ar[1]=10;
		//ar[2]=12;
		//ar[3]=14;
		//ar[4]=16;
		for(int var:ar)
		{
			System.out.println(var);
			count++;
		}
		System.out.println("total no. of element="+count);
	}
}