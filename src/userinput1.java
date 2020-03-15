import java.util.Scanner;
class userinput1
{
	void func()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter principle value");
		double pri=sc.nextDouble();
		
		System.out.println("Enter rate");
		float rate =sc.nextFloat();
		
		System.out.println("Enter time");
		int time =sc.nextInt();
		double intrest= (pri*rate*time)/100;
		System.out.println("Total intrest="+intrest);
	}
	public static void main(String arr[])
	{
		userinput1 obj=new userinput1();
		obj.func();
	}
}