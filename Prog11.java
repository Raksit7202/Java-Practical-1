class Prog11
{
	public static void main(String ar[])
	{
		int  s=5;
		for(int i=1;  i<=s; i++)
		{
			for(int j=s-i; j>0; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>0; j--)
			{
				System.out.print(i +  " ");
			}
			System.out.println();
		}
	}
}