
public class String20 
{
	public static void main(String[] args) 
	{
		String s="abaaaaabbbccccddeeee";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			if(count==0)
				s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}
}
