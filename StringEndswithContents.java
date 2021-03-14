// Write a program to check whether a given string ends with the contents of another string.

package stringpractice;

public class StringEndswithContents 
{
	public static void main(String[] args) 
	{
	String s1="HelloWorld";
	String s2="Wobhjrld";
	
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	
	int len=c1.length-c2.length;
	int k=0;
	
	for(int i=len;i<c1.length;i++)
	{
		if(c1[i]==c2[k])
			k++;
		else
			break;
	}
	if(k==c2.length)
		System.out.println("string ends with the contents of another string");
	else
		System.out.println("string does not ends with the contents of another string");
	}
}
