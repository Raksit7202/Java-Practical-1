class Prog10
{
	public static void main (String ar[])
	{
		int j=1,s=4;
		for(int i=1; i<=s; i++)
		{
			for(int x=s-i; x>0; x--)
			{
				System.out.print(" ");
			}
			for(int y=i; y>0; y--)
			{
				System.out.print(j++ + " ");
			}
			System.out.println();
		}
	}
}