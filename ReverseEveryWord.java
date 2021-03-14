package stringpractice;

import java.util.Scanner;

public class ReverseEveryWord 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Original String:");
	String str=sc.nextLine();
	
	String words[]=str.split(" ");
	String revStr=" ";
	
	for(int i=0;i<words.length;i++)
	{
		if(i==words.length-1)
			revStr=words[i]+revStr;
		else
			revStr=" "+words[i]+revStr;
	}
	System.out.println("Reversed string :"+revStr);
	}
}
