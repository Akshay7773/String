//String with two dimensional array
public class TwoD_Array1
{
	public static void main(String args[])
	{
		String str[][]=new String[2][3];
		str[0][0]="aks";
		str[0][1]="aklfj";
		str[0][2]="akafs";
		str[1][0]="aks gsg";
		str[1][1]="aks dgs";
		str[1][2]="abasdks";
		str[0][0]="aksadf";
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
