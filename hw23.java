import java.util.Arrays;

public class hw23 
{
	public static void main(String[] args) 
	{
		int[] a1= {1,3,4,5,7};
		int[] a2= {4,6,8,10};
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
					count++;
			}
		}
		//System.out.println(count);
		int[] a=new int[count];
		int index=0;
		//int[] a1= {1,3,4,5,7};
		//int[] a2= {4,6,8,10};
		for(int i=0;i<a1.length;i++)
		{
			
			for(int j=0;j<a2.length;j++)
			{
				int count2=0;
				if(a1[i]!=a2[j])
					count2++;
				if(count2==0)
				{
					a[index++]=a1[i];
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
