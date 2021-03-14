// Write a program to check whether a given string starts with the contents of another string.
package stringpractice;

public class StartswithContent 
{
	public static void main(String[] args) 
	{
		String s1="Welcome";
		String s2="dfgh";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int count=0;
		for(int i=0;i<c2.length;i++)
		{
			if(c1[i]==c2[i])
				count++;
			else
				break;
		}
		
		if(count==c2.length)
			System.out.println("string starts with the contents of another string.");
		else
			System.out.println("string does not starts with the contents of another string.");
	}

}
