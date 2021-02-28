package strings;
public class CharTwiceEvenThriceOddAsciValue 
{
	public static void main(String[] args)
	{
	String s="hefshine";
	String s1="";
	for (int i = 0; i < s.length(); i++)
	{
		char c=s.charAt(i);
		if(c%2==0)
		{
			s1=s1+c+c;
		}
		else
		{
			s1=s1+c+c+c;
		}
	}
	System.out.println(s1);
	}
}
