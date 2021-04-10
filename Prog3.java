import java.util.Scanner;

class Prog_3 {
	public static void main (String ar[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of a :");
		int a = scan.nextInt();
		System.out.print("Enter the value of b :");
		int b = scan.nextInt();
		scan.close();
		System.out.println("a << 2 + b >> 2 : " + (a<<2+b>>2));
		System.out.println("(a << 2) + (b >> 2) :" + ((a<<2)+(b>>2)));
		System.out.println("a & b :" + (a&b));
		System.out.println("a | 4 a >> b & 7 :" + (a|4+a>>b&7));
	}
} 