

public class LiftPattern 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<17;i+=2)
		{
			for(int j=0;j<9;j++)
			{
				if(j-i<=0 && j+i<=16)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}
}
