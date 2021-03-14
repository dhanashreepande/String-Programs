//Write a program to sort numbers in a String. Display the result as a String.
//E.g. if number in String is “43521” result is: “12345”.
package stringpractice;

public class StringNumber {

	public static void main(String[] args)
	{
	String s1="43521";
	char c1[]=s1.toCharArray();
	
	for(int i=0;i<c1.length;i++)
	{
		for(int j=i+1;j<s1.length();j++)
		{
			if(c1[i]>='0' || c1[i]<='9')
			{
				if(c1[i]>c1[j])
				{
					char c=c1[i];
					c1[i]=c1[j];
					c1[j]=c;
				}
			}
		}
	}
	String s2=new String(c1);
	System.out.println(s2);
	}

}
