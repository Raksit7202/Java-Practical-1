class Prog4 {
	public static void main (String ar[])
	{
		System.out.println("Example of break statement...");
		for(int i=0; i<5; i++)
		{
			System.out.print(" " + i);
			if(i==3)
			break;
		}
		System.out.println("\nExample of continue statement...");
		for(int i=0; i<5; i++)
		{
			System.out.print(" " + i);
			if(i==3)
			continue;
			System.out.print(" " + i);
		}
	}
}