import java.util.*;
class Prog17
{
  public static void main(String ar[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter value:");
    int x = scan.nextInt();
    num no = new num(x);
    if(no.ChkDigit()==5)
    {
      System.out.println(no.sum());
    }
    else
    {
      System.out.println("Length is not valid...");
    }
  }
}
class num
{
  int n;
  num()
  {
    n=0;
  }
  num(int x)
  {
    n=x;
  }
  public int ChkDigit()
  {
    int len = 0, temp = 1;
    while (temp <= n)
    {
      len++;
      temp *= 10;
    }
    return len;
  }
  public long sum()
  {
    long s = 0;
    int t = n;
    while (t != 0)
    {
      s = s + t % 10;
      t = t/10;
    }
    return s; 
  }
}
