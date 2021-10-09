import java.util.Arrays;

public class InarrrayRecursion
{
	public static void main(String[] args) 
	{
		int a[]= {5,1,3,6,8,2,9,0,10};
		int inele=0;
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
		//System.out.println(inele);
		//System.out.println(deele);
		int incount=countin(a,1,2,inele);
		System.out.println(incount);
		int[] inarray=new int[incount];
		int[] dearray=new int[a.length-incount];
		inele=0;deele=0;
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
		putvalues(a, inarray, dearray, inindex, deindex,2,inele, deele);
		System.out.println(Arrays.toString(inarray));
		System.out.println(Arrays.toString(dearray));
		
	}

	
	private static void putvalues(int[] a, int[] inarray, int[] dearray, int inindex, int deindex, int i, int inele,
			int deele)
	{
		
		
		if(a[i]>inele)
		{
			inele=a[i];
			inarray[inindex++]=a[i];
		}
		else
		{
			deele=a[i];
			dearray[deindex++]=a[i];
		}
		i++;
		if(i<a.length)
			putvalues(a, inarray, dearray, inindex, deindex, i, inele, deele);
	}


	//to count incount of array
	private static int countin(int[] a, int incr, int i, int inele)
	{
		if(a[i]>inele)
		{
			inele=a[i];
			incr++;
		}
		i++;
		if(i<a.length)
			return countin(a, incr, i, inele);
		return incr;
	}
}
