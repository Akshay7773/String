
public class SpiralPattern2 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[5][5];
		int imin=0;
		int jmin=0;
		int imax=a.length-1;
		int jmax=a[0].length-1;
		int cnt=1;
		while(imin<=imax)
		{
		for(int i=jmin;i<=jmax;i++)
		{
			a[imin][i]=cnt++;
		}
		imin++;
		for(int i=imin;i<=imax;i++)
		{
			a[i][jmax]=cnt++;
		}
		jmax--;
		for(int i=jmax;i>=jmin;i--)
		{
			a[imax][i]=cnt++;
		}
		imax--;
		for(int i=imax;i>=imin;i--)
		{
			a[i][jmin]=cnt++;
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
