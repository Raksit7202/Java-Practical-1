import java.util.Scanner;
class Prog12
{
	public static void main(String ar[])
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		for(int i=0; i<5; i++)
		{
			System.out.print("Enter value :");
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<5; j++)
			{
				if(arr[i]>arr[j])
				{
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			sum = sum + arr[i];
			System.out.println("Value = " + arr[i]);
		}
		System.out.println("Sum = " + sum);
	}
}