
public class SpiralPattern
{
	public static void main(String[] args) 
	{
		int [][] a=new int[5][5];
		int imin=0;
		int jmin=0;
		int jmax=a[0].length-1;
		int imax=a.length-1;
		int count=1;
		while(imin<=imax) 
		{
		for(int i=jmin;i<=jmax;i++)
		{
			a[imin][i]=count++;
		}
		imin++;
		for(int i=imin;i<=imax;i++)
		{
			a[i][jmax]=count++;
		}
		jmax--;
		for(int i=jmax;i>=jmin;i--)
		{
			a[imax][i]=count++;
		}
		imax--;
		for(int i=imax;i>=imin;i--)
		{
			a[i][jmin]=count++;
		}
		jmin++;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
