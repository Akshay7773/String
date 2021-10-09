//display only palindrome string within 10 objects of string
public class String_Palindrome5 
{
	public static void main(String[] args) 
	{
		String s1=new String("akshay");
		String s2=new String("nitin");
		String s3=new String("abcddcba");
		String s4=new String("gawade");
		String[] s= {s1,s2,s3,s4};
		for(int i=0;i<s.length;i++)
		{
			int x,y;
			if(s[i].length()%2==0)
			{
				x=s[i].length()/2-1;
				y=s[i].length()/2;
			}
			else
			{
				x=s[i].length()/2;
				y=s[i].length()/2;
			}
			
			while(x>=0)
			{
				if(s[i].charAt(x)!=s[i].charAt(y))
					break;
				x--;y++;
			}
			if(x==-1)
				System.out.println(s[i]);
		}
	}
}
