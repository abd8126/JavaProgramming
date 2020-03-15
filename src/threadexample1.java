class threadexample1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try 
			{
				sleep(1000);//for 1 sec
				if (i==5)
				{
					stop();
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String arr[])
	{
		threadexample1 obj=new threadexample1();
		obj.start();
	}
}