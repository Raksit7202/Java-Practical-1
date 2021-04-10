import java.util.*;
public class Prog7
{
	public static void main(String ar[])
	{
		
		int choice,a,b;
		do
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Select your choice...");
			System.out.println("0. Exit");
			System.out.println("1. Sum");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divition");
			choice = scan.nextInt();
			calc var = new calc();
			switch(choice)
			{
				case 0:
				break;
				case 1:
					System.out.print("Enter first value : ");
					a = scan.nextInt();
					System.out.print("Enter second value :");
					b = scan.nextInt();
					var = new calc(a,b);
					var.sum();
					break;
				case 2:
					System.out.print("Enter first value : ");
					a = scan.nextInt();
					System.out.print("Enter second value :");
					b = scan.nextInt();
					var = new calc(a,b);
					var.sub();
					break;
				case 3:
					System.out.print("Enter first value : ");
					a = scan.nextInt();
					System.out.print("Enter second value :");
					b = scan.nextInt();
					var = new calc(a,b);
					var.mult();
					break;
				case 4:
					System.out.print("Enter first value : ");
					a = scan.nextInt();
					System.out.print("Enter second value :");
					b = scan.nextInt();
					var = new calc(a,b);
					var.div();
					break;
				default:
				System.out.println("Your Entered choice is not valid....");
			}
		}while(choice != 0);
	}
}
class calc 
{
	int a,b;
	calc()
	{
		a=b=0;
		
	}
	calc(int x,int y)
	{
		a=x;
		b=y;
	}
	public void sum()
	{
		System.out.println("Sum is "+(a+b));
	}
	public void sub()
	{
		System.out.println("Subtraction is "+(a-b));
	}
	public void mult()
	{
		System.out.println("multiplication is "+(a*b));
	}
	public void div()
	{
		System.out.println("divition is "+((double)a/(double)b));
	}
};