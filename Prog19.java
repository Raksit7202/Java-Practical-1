import java.util.*;
class Prog19
{
  public static void main(String ar[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number of Employees :");
    int len = scan.nextInt();
    System.out.println("Enter the Details of " + len + " Employees. ");
    Employee emp[] = new Employee[len];
    for(int i=0; i<len; i++)
    {
      int id = scan.nextInt();
      scan.nextLine();
      String name = scan.nextLine();
      long sal = scan.nextLong();
      emp[i] = new Employee(id,name,sal);
    }
    System.out.println("Enter your choice from above...");
    System.out.println("0.Exit\n1.Sort by name\n2.Sort by Salary");
    int ch = scan.nextInt();
    switch(ch)
    {
      case 0:
        break;
      case 1:
        Employee.byName(emp,len);
        break;
      case 2:
        Employee.bySal(emp,len);
        break;
      default:
        System.out.println("Invalid Choice...");
    }
  }
}
class Employee
{
  private int id;
  private String name;
  private long sal;
  Employee()
  {
    id = 0;
    name = "";
    sal = 0;
  }
  Employee(int x, String y, long z)
  {
    id = x;
    name = y;
    sal = z;
  }
  public static void byName(Employee [] emp, int len)
  {
    for(int i=0; i<len; i++)
    {
      for(int j=i; j<len; j++)
      {
        if(emp[i].name.compareTo(emp[j].name)>0)
        {
          int t = emp[i].id;
          emp[i].id = emp[j].id;
          emp[j].id = t;
          String temp = emp[i].name;
          emp[i].name = emp[j].name;
          emp[j].name = temp;
          long tem = emp[i].sal;
          emp[i].sal = emp[j].sal;
          emp[j].sal = tem;
        }
      }
    }
    for(int i=0; i<5; i++)
    {
      System.out.println(emp[i].id +"\t"+emp[i].name+"\t"+emp[i].sal);
    }
  }
  public static void bySal(Employee [] emp, int len)
  {
    for(int i=0; i<len; i++)
    {
      for(int j=i; j<len; j++)
      {
        if(emp[i].sal < emp[j].sal)
        {
          int t = emp[i].id;
          emp[i].id = emp[j].id;
          emp[j].id = t;
          String temp = emp[i].name;
          emp[i].name = emp[j].name;
          emp[j].name = temp;
          long tem = emp[i].sal;
          emp[i].sal = emp[j].sal;
          emp[j].sal = tem;
        }
      }
    }
    for(int i=0; i<5; i++)
    {
      System.out.println(emp[i].id +"\t"+emp[i].name+"\t"+emp[i].sal);
    }
  }
}
