/*
 *  Write a program to sort in ascending and descending order by length of the given array
of strings
 */
package stringpractice;

import java.util.Scanner;

public class SortByLength 
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter size of String");
		  int size=sc.nextInt();
		  String s[]=new String[size];
		  System.out.println("enter "+size+" String");
		  
		  for(int i=0;i<s.length;i++)
		  {
			s[i]=sc.next();
		  }
	System.out.println("---------descending order------------");
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[j].length()>s[i].length())
			{
				String t=s[i];
				s[i]=s[j];
				s[j]=t;
			}
		}
		System.out.println(s[i]);
	}
	
	System.out.println("--------ascending order--------------");
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[j].length()<s[i].length())
			{
				String t=s[i];
				s[i]=s[j];
				s[j]=t;
			}
		}
		System.out.println(s[i]);
	}
	}
}
