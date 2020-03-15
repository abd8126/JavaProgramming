/*create a regular expression that accept 10digit numeric character only starting char 789*/

import java.util.regex.*;
class regexExaple4
{
	public static void main(String args[])
	{
		System.out.println("by character classes and qualification");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","97194990989"));//false(more than six)
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","7485458545"));//true
		System.out.println(Pattern.matches("[789][0-9]{9}","97194990989"));//false(more than six)
		System.out.println(Pattern.matches("[789][0-9]{9}","7485458545"));//true
		System.out.println("by metacharacter");
		System.out.println(Pattern.matches("[789]{1}\\d{9}","97194990989"));//false(more than six)
		System.out.println(Pattern.matches("[789]{1}\\d{9}","7485458545"));//true
	}
}