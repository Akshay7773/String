
public class StringPalindrome1 
{
	public static void main(String[] args) 
	{
		String s="abcddcba";
		int i,j;
		if(s.length()%2!=0)
		{
			i=s.length()/2;
			j=s.length()/2;
		}
		else
		{
			i=s.length()/2-1;
			j=s.length()/2;
		}
		while(i>=0)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				break;
			}
			i--;j++;
		}
		if(i==-1)
			System.out.println("yes");
		else
			System.out.println("No");
	}
}
