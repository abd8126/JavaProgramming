import java.util.regex.*;
public class regexexample
{
	public static void mai(String[]args)
	{
		/*1st way
		pattern p=Pattern.compile(".s");//.represents single char
		Matcher m=p.matcher("as");
		oolean b1=m.matcher();
		System.out.println(b1);
		*/
		/*2way
		boolean b2=Patter.compile(".c").matcher("as").matches();
		System.out.print(b2);
		*/
		//3rd way
		boolean b3=Pattern.matches(".com","aahcom");
		System.out.println(b3);
	}
}