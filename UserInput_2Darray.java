//input from user in String 2D array
import java.util.*;
public class UserInput_2Darray 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[][]=new String[2][3];
		System.out.println("Enter string value");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				str[i][j]=sc.nextLine();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("str["+i+"]["+j+"]="+str[i][j]);
			}
			System.out.println();
		}
	}
}
