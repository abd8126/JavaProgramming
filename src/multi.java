class thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("shiva...."+i);
				if(i==5)
				{
					stop();
				}
				sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println("shivansh...."+j);
				if(j==5)
				{
					stop();
				}
				sleep(30000);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}

class multi 
{
	public static void main(String arr[])
	{
		thread1 th1=new thread1();
		thread2 th2=new thread2();
		
		th1.start();
		
		th2.start();
		
	}
}