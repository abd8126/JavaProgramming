
import java.util.regex.*;
class regexExaple5
{
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("[amn]","abcd"));//false
		System.out.println(Pattern.matches("[amn]","a"));
		System.out.println(Pattern.matches("[amn]","amn"));//true
	}
}