import java.util.Scanner;

//Add 10 StringBuffer objects in an Array , Count no. Of Palindrome Strings, Display in Ascending order 
//such Strings

public class Hw30 
{
	public static void main(String[] args) 
	{
	String s1[]= {"madam","abcd","12321","nitin"};
		
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			StringBuffer sb=new StringBuffer(s1[i]);
	        String s2=new String(sb.reverse());
	        System.out.println(s2);
		
		if(s1[i].equalsIgnoreCase(s2))
		{
			count++;
			System.out.println(count+" is palindrome string ");
		}
		else
			System.out.println("Not palindrome");	
	}
}
}
