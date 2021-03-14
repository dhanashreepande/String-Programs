//Write a program to find the maximum occurring character in a string.

package stringpractice;

public class MaxOccurringChar
{
	public static void main(String[] args) 
	{
		String s = "fchgfghcfdgdgfcfgcfc";
		char c[] = s.toCharArray();
		int n=0;
		char ch = ' ';
		
		for(int i = 0;i<c.length;i++)
		{
			int cnt = 1;
			for(int j = i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					cnt++;
				}
			}
			if(n<cnt)
			{
				n = cnt;
				ch = c[i];
			}
		}
		System.out.println(ch+" max "+n);
	}
}