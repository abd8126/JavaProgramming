import java.io.*; 

class constractor 
{ 
	String name; 
	int id; 

	constractor(String name, int id) 
	{ 
		this.name = name; 
		this.id = id; 
	} 
} 

class constractor3 
{ 
	public static void main (String[] args) 
	{ 
		constractor const1 = new constractor("adam", 1); 
		System.out.println("constractorName :" + const1.name + 
						" and constractorId :" + const1.id); 
	} 
} 
