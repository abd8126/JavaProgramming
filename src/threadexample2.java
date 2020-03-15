class threadexample2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName());
			try 
			{
				sleep(1000);//for 1 sec
				
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String arr[])
	{
		threadexample2 obj=new threadexample2();
		obj.start();
		obj.setName("china");
	}
}