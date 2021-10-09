//user input in string
import java.util.Scanner;
public class UserInput
{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		str=sc.nextLine();
		System.out.println("Entered string is="+str);
	}
}
