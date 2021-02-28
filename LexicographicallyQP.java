package strings;

public class LexicographicallyQP {

	public static void main(String[] args) 
	{
	String a="abcddcgbngnvfdxfcjvhv";
	String b="abcdefgcjjhb";
	
	System.out.println(a.compareTo(b));
	boolean flag=true;
	for (int i = 0; i < a.length()&&i<b.length(); i++)
	{
		if(a.charAt(i)!=b.charAt(i))
		{
		System.out.println(a.charAt(i)-b.charAt(i));
		flag=false;
		break;
	}
	}
	if(flag==true)
	{
		if(a.length()!=b.length())
			System.out.println(a.length()-b.length());	
		else
			System.out.println(0);
	}
	}
}
