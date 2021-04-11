import java.util.*;
class Prog21
{
  public static void main(String ar[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the details of account holder :");
    System.out.print("Enter Name :");
    String name = scan.nextLine();
    System.out.print("Enter Account Number :");
    String ac_no = scan.nextLine();
    System.out.print("Enter Account Balance :");
    long bal = scan.nextLong();
    System.out.print("Do you want to add some additional details...");
    System.out.println("give answer in True or False...");
    boolean ch = scan.nextBoolean();
    if(ch)
    {
      System.out.print("What's type of your account :");
      String ac_type = scan.nextLine();
      System.out.print("What's Your Home address :");
      String add = scan.nextLine();
      account ac1 = new account(name,ac_no,ac_type,add,bal);
      System.out.println("Account balance = " + ac1.get_balance());
      System.out.println("Deposited = 500" + "\tAccount balance = " + ac1.deposit(500));
      System.out.println("Withdraw = 500" + "\tAccount balance = " + ac1.withdraw(400));
    }
    else
    {
      account ac1 = new account(name,ac_no,bal);
      System.out.println("Account balance = " + ac1.get_balance());
      System.out.println("Deposited = 500" + "\tAccount balance = " + ac1.deposit(500));
      System.out.println("Withdraw = 500" + "\tAccount balance = " + ac1.withdraw(400));
    }
  }
}
class account
{
  private String name, ac_no, ac_type, add;
  private long bal;
  account(String x_name,String x_no, long x_bal)
  {
    name = x_name;
    ac_no = x_no;
    bal = x_bal;
  }
  account(String x_name, String x_no, String x_type, String x_add, long x_bal)
  {
    name = x_name;
    ac_no = x_no;
    ac_type = x_type;
    add = x_add;
    bal = x_bal;
  }
  public long deposit(long x)
  {
    bal = bal + x;
    return bal;
  }
  public long withdraw(long x)
  {
    bal = bal - x;
    return bal;
  }
  public long get_balance()
  {
    return bal;
  }
}
