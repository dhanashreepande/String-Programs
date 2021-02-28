package strings;

public class SplitString
{
	public static void main(String[] args)
	{
	String s="abcPjklPxyz";
	int cnt=0;
	for (int i = 0; i < s.length(); i++)
	{
		if(s.charAt(i)=='P')
			cnt++;
	}
	String[] sa=new String[cnt+1];
	int si=0,ei=0,index=0;
	for (int i = 0; i < s.length(); i++)
	{
		if(s.charAt(i)=='P'||i==s.length()-1)
		{
			ei=i;
			if(i==s.length()-1)
				ei++;
			String p=s.substring(si,ei);
			sa[index++]=p;
			si=i;
		}
	}
	for (String string : sa)
		System.out.println(string);
	}
}
