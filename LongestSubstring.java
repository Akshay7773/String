
public class LongestSubstring 
{
	public static void main(String[] args) 
	{
		String s="abcdacdabcdefghaba";
		int start,end;
		int length=0;
		for(int i=0;i<s.length();i++)
		{
			start=i;
			end=i;
			for(int j=i+1;j<s.length();j++)
			{
				int count=0;
				for(int k=start;k<=end;k++)
				{
					if(s.charAt(k)==s.charAt(j))
						count++;
				}
				if(count==0)
				{
					end++;
				}
				else 
					break;
				if(length<(end-start+1))
				{
					length=end-start+1;
				}
			}
		}
		System.out.println(length);
	}
	
}
