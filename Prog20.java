import java.util.*;
class Prog20
{
  public static void main(String ar[])
  {
    Scanner scan = new Scanner(System.in);
    Rectangle x = new Rectangle();
    Rectangle y = new Rectangle();
    System.out.print("Enter langth of first Rectangle :");
    double len = scan.nextDouble();
    x.set_length(len);
    System.out.print("Enter width of first Rectangle:");
    double wid = scan.nextDouble();
    x.set_width(wid);
    System.out.print("Enter Colour of first Rectangle:");
    scan.nextLine();
    String col = scan.nextLine();
    x.set_colour(col);
    System.out.print("Enter langth of second Rectangle :");
    len = scan.nextDouble();
    y.set_length(len);
    System.out.print("Enter width of second Rectangle:");
    wid = scan.nextDouble();
    y.set_width(wid);
    System.out.print("Enter Colour of second Rectangle:");
    scan.nextLine();
    col = scan.nextLine();
    y.set_colour(col);
    System.out.println("Area of first Rectangle is " + x.find_area());
    System.out.println("Area of second Rectangle is " + y.find_area());
    if(x.match(y))
    {
      System.out.println("Matching Rectangles");
    }
    else
    {
      System.out.println("Non Matching Rectangles");
    }
  }
}
class Rectangle
{
  private double w,l,a;
  private String colour;
  void set_length(double x)
  {
    l = x;
  }
  void set_width(double x)
  {
    w = x;
  }
  void set_colour(String x)
  {
    colour = x;
  }
  public double find_area()
  {
    a = w*l;
    return a;
  }
  public boolean match(Rectangle x)
  {
    if((a==x.a)&&(colour.compareTo(x.colour)==0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
