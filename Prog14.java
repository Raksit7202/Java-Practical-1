import java.util.*;
class Prog14
{
  public static void main (String ar[])
  {
    stack s1 = new stack();
    s1.pop();
    s1.push(34);
    s1.push(89);
    s1.pop();
  }
}
class stack
{
  int [] base = new int[10];
  int size;
  stack()
  {
    base[0]=0;
    size=0;
  }
  public void push(int x)
  {
    if(size==10)
    {
      System.out.println("---Stack was overflow----");
    }
    else
    {
      base[size]=x;
      System.out.println(base[size]+" Was pushed.");
      size++;
    }
  }
  public void pop()
  {
    if(size==0)
    {
      System.out.println("---Stack was underflow---");
    }
    else
    {
      System.out.println(base[size-1]+" Was popped...");
      base[size-1]=0;
      size--;
    }
  }
}
