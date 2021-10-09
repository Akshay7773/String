//Dynamic memory allocation in String one d
import java.util.Scanner;
public class StringDynamicAllocation1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter value for memory allocation");
		n=sc.nextInt();
		String str[]=new String[n];
		System.out.println("Enter values for string");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println("str["+i+"]="+str[i]);
		}
	}
}
