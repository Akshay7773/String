//input from user in One D array
import java.util.Scanner;
public class InputOne_darrayString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[]=new String[5];
		System.out.println("Enter String value");
		for(int i=0;i<5;i++)
		{
			str[i]=sc.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("str["+i+"]="+str[i]);
		}
	}
}
