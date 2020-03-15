import java.util.Scanner;
class userinput
{
	void func()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first value");
		String str1=sc.next();
		int var1=Integer.parseInt(str1);
		System.out.println("Enter Second  value");
		int var2=sc.nextInt();
		
		int var=var1+var2;
		System.out.println("Total="+var);
	}
	public static void main(String arr[])
	{
		userinput obj=new userinput();
		obj.func();
	}
}