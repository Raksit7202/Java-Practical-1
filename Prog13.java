import java.util.Scanner;
class Prog13
{

	public static void main(String ar[])
	{
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.println("Enter five values to calculate average :");
		for(int i=0; i<5; i++)
		{
			arr[i] = scan.nextInt();
		}
		average stud1 = new average(arr);
		System.out.println("Average is " + stud1.avg());
	}
}
class average
{
	int[] val = new int[5];
	average(int [] arr)
	{
		for(int i=0; i<5; i++)
		{
			val[i] = arr[i];
		}
	}
	public double avg()
	{
		return (val[0]+val[1]+val[2]+val[3]+val[4])/(double)5;
	}
}