
class stringExample {
   void func()
	{
		String str1="hello i m shiva";
		String str2="HELLO I M SHIVA";
		System.out.println(str1);
		String res=str1.toUpperCase();//to make string upper
		String res1;//to make string lower
       res1 = str1.toLowerCase();
		String res2=str1.trim();//to trim string
		int res3=str1.compareTo(str2);//to compare two string
		int res4=str1.compareToIgnoreCase(str2);
		String res5=str1.concat(str2);
		String res6=str1.substring(5);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(str1.length());
		System.out.println("string after trim"+res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
	}
	public static void main(String args[])
	{
            stringExample obj=new stringExample();
		obj.func();
        } 
}
