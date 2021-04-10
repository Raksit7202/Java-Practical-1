import java.util.*;
class Prog15
{
  public static void main(String args[])
  {
    int sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of first matrix");
    int m = scan.nextInt();
    int n = scan.nextInt();
    int first[][] = new int[m][n];
    System.out.println("Enter elements of first matrix");
    for(int i=0; i<m; i++)
      for (int j=0; j<n; j++)
        first[i][j]=scan.nextInt();
    System.out.println("Enter the number of rows and columns of second matrix");
    int p = scan.nextInt();
    int q = scan.nextInt();
    if (n != p)
    {
      System.out.println("The matrices can't be multiplied with each other.");
    }
    else
    {
      int second[][] = new int[p][q];
      int multiply[][] = new int[m][q];
      System.out.println("Enter elements of second matrix");
      for(int i=0; i<p; i++)
        for(int j=0; j<q; j++)
          second[i][j] = scan.nextInt();
      for(int i=0; i<m; i++)
      {
        for(int j=0; j<q; j++)
        {
          for(int k=0; k<p; k++)
            sum = sum + first[i][k]*second[k][j];
          multiply[i][j] = sum;
          sum = 0;
        }
      }
      System.out.println("Product of the matrices:");
      for (int i=0; i<m; i++)
      {
        for (int j=0; j<q; j++)
          System.out.print(multiply[i][j]+"\t");
        System.out.print("\n");
      }
    }
  }
}
