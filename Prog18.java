import java.util.*;
class Prog18
{
  public static void main(String ar[])
  {
    Scanner scan = new Scanner(System.in);
    Student info[] = new Student[5];
    for(int i=0; i<5; i++)
    {
      int x = scan.nextInt();
      String y = scan.nextLine();
      info[i] = new Student(x,y);
    }
    for(int i=0; i<5; i++)
    {
      info[i].output();
    }
  }
}
public class Student
{
  private int rno;
  private String name;
  Student(int x, String y)
  {
    rno = x;
    name = y;
  }
  public void output()
  {
    System.out.println(rno + "\t" + name);
  }
}
