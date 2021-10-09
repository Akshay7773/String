//string with two dimensional length
public class TwoDarrayStrLength 
{
	public static void main(String args[])
	{
		String str[][]= {
				{"afl","ajfl","ajdfl"},
				{"gsdahg","dfjas","gjljd aldjf"},
				{"afdj","djf","djfsjdfkj"}
		};
		System.out.println("Row size="+str.length);
		System.out.println("Column size="+str[0].length);
		System.out.println("gsdahg length="+str[1][0].length());
	}
}
