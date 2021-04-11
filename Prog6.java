import java.util.*;
class Prog6
{
    public static void main(String args[])
    {
      overload x = new overload();
      x.area(5);
      x.area(11,12);
      x.area(2.5);
    }
}
class overload
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
