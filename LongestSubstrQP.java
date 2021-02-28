package strings;
public class LongestSubstrQP 
{
	public static void main(String[] args) 
	{
		String s="abcdabaaa";
		int si=0;
		int ei=0;
		int len=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++)
			{
				int cnt=0;
				for (int k = i; k < j; k++)
				{
					if(s.charAt(k)==s.charAt(j))
						cnt++;
				}
				if(cnt==2)
				{
					if(j-i>len)
					{
						len=j-i;
						si=i;
						ei=j;
					}
					break;
				}
			}
		}
		for (int i = si; i < ei; i++)
		{
			System.out.print(s.charAt(i));
		}
	}
}