//13) Write a program to remove a specified character from a given string.
public class Hw13 
{
	public static void main(String[] args) 
	{
	String s1="Dhanashree";
	
	char c1[]=s1.toCharArray();
	
	for(char x:c1)
		System.out.print(x);
	System.out.println();
	int i,count=0;
	
	for(i=0;i<c1.length;i++)
	{
		if(c1[i]=='s')
		{
			c1[i]=c1[i+1];
			c1[i]=0;
		}
		count++;
		if(c1[i]!=0)
			System.out.print(c1[i]+" ");
	}
	System.out.println();
	if(count==0)
		System.out.println("Character not found");
	else
		System.out.println("Character removed");
	}
}
