package strings;

public class ExtraSpaceQP {

	public static void main(String[] args) 
	{
	String s="   gdhdj   hdjdj   hdjj dh   ";
	int si=0,ei=s.length()-1;
	while(true)
	{
		if(s.charAt(si)!=' ')
		break;
		else
			si++;
	}
	while(true)
	{
		if(s.charAt(ei)!=' ')
			break;
		else
			ei--;
	}
	String s1="";
	for (int i = si; i <=ei; i++)
	{
	s1=s1+s.charAt(i);
	}
	String s2="";
	for (int i = 0; i < s1.length(); i++)
	{
		if(s1.charAt(i)==' '&& s1.charAt(i+1)==' '&& s1.charAt(i+2)==' ')
		{
			
		}
		else if(s1.charAt(i)==' '&& s1.charAt(i+1)==' ')
		{
			s2=s2+"  ";
			i++;
		}
		else if(s1.charAt(i)==' ')
			s2=s2+"  ";
		else
			s2=s2+s1.charAt(i);
		
	}
	s2=" "+s2+"  ";
	System.out.println(s2);

}
}