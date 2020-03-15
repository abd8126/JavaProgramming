/*create a regular expression that accept alphanumeric character only its length must be six character long only*/

import java.util.regex.*;
class regexExaple3
{
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun23"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","kkvarun32"));//false(more than six)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2UkS"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","Arun$2"));//false($not define)
	}
}