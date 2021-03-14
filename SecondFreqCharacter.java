package stringpractice;

public class SecondFreqCharacter 
{
	public static void main(String[] args)
	{
	String s="cnjdndjksn";
	char c1[]=s.toCharArray();
	
	int count,k=0;
	int temp[]=new int[c1.length];
	
	for(int i=0;i<c1.length;i++)
	{  count=1;
	if(c1[i]!='0')
	{
		for(int j=i+1;j<c1.length;j++)
		{
			if(c1[i]==c1[j])
			{
				count++;
				c1[j]='0';
			}
		}
		temp[i]=count;
	}
	}
	
	int max1=temp[0];
	int max2=0;
	int m=0;
	for(int i=1;i<c1.length-1;i++)
	{
		if(max1<temp[i])
		{
			max2=max1;
			max1=temp[i];
			k=i;
		}
		if(max2<temp[i] && temp[i]!=max1 )
			{
			max2=temp[i];
			m=i;
			}
	}
	System.out.println(c1[k]+"  Max="+max1);
	System.out.println(c1[m]+"  Max2="+max2);
	}
}