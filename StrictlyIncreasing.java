import java.util.Arrays;

public class StrictlyIncreasing
{
	public static void main(String[] args) 
	{
		int[] a= {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int inele=0;//1,3,6,8,9,10
		int deele=0;
		if(a[0]>a[1])
		{
			inele=a[1];
			deele=a[0];
		}
		else
		{
			inele=a[0];
			deele=a[1];
		}
		int incount=1;
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>inele)
			{
				inele=a[i];
				incount++;
			}
		}
		//System.out.println(incount);
		int[] inarray=new int[incount];
		int[] dearray=new int[a.length-incount];
		inele=0;
		deele=0;
		if(a[0]>a[1])
		{
			inele=a[1];
			inarray[0]=inele;
			deele=a[0];
			dearray[0]=deele;
		}
		else
		{
			inele=a[0];
			inarray[0]=inele;
			deele=a[1];
			dearray[0]=deele;
		}
		int inindex=1;
		int deindex=1;
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>inele)
			{
				inele=a[i];
				inarray[inindex++]=a[i];
			}
			else if(a[i]<deele)
			{
				deele=a[i];
				dearray[deindex++]=a[i];
			}
		}
		System.out.println(Arrays.toString(inarray));
		System.out.println(Arrays.toString(dearray));
	}
}
