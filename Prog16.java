import java.util.*;
class Prog16
{
  public static void main (String ar[])
  {
    String name[] = new String[5];
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter five names to sort...");
    for(int i=0; i<5; i++)
    {
      name[i] = scan.nextLine();
    }
    for(int i=0; i<5; i++)
    {
      for(int j=i; j<5; j++)
      {
        if(name[i].compareTo(name[j])>0)
        {
          String temp = name[i];
          name[i] = name[j];
          name[j] = temp;
        }
      }
    }
    System.out.println("After name sorting...");
    for(int i=0; i<5; i++)
    {
      System.out.println(name[i]);
    }
  }
}
