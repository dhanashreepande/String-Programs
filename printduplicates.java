import java.util.Scanner;

//Write a program to print after removing duplicates from a given string.

public class Hw20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s1=sc.next();
		
		char c[]=s1.toCharArray();
		
		for(char x:c)
			System.out.print(x);
		System.out.println();

		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				c[j]=0;
			}
		}
		for(int i=0;i<c.length;i++)
		{
		if(c[i]!=0)
			System.out.print(c[i]);
	}
}
}
