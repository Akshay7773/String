//Array of string
public class StringArray1 
{
	public static void main(String args[])
	{
		String name[]=new String[3];
		name[0]="geeky";
		name[1]="shows";
		name[2]="utube";
		System.out.println("String values are=");
		for(int i=0;i<3;i++)
		{
			System.out.println("name["+i+"]="+name[i]);
		}
	}
}
