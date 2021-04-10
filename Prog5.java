import java.util.*;
class Prog5
{
  public static void main(String ar[])
  {
      box b1 = new box();
      box b2 = new box(2.77);
      b1.vol();
      b2.vol();
  }
}
class box
{
  double h,w,d;
  box()
  {
    h=w=d=0;
  }
  box(double x)
  {
    h=w=d=x;
  }
  public void vol()
  {
    System.out.println("volume is " + h*w*d);
  }
}
