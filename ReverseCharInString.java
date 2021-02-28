package strings;
public class ReverseCharInString 
{
	public static void main(String[] args) 
	{
	String s="I am in HefShine";
	int si=0;
	for (int i = 0; i <s.length(); i++)
	{
		if(s.charAt(i)==' ')
		{
		for (int j = i-1; j >=si; j--) 
		{
			System.out.print(s.charAt(j));
		}
		System.out.print(" ");
		si=i+1;
	}
	else if(i==s.length()-1)
	{
		for (int j = i; j >=si; j--) 
		{
			System.out.print(s.charAt(j));
		}
	}
	}
	}
}