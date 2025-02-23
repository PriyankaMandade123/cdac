import java.util.Scanner;
public class Powerofnum{
  public static void main(String args[])
{
    int n,p,result;
 System.out.println("Input base number: " + n );
    Scanner sc= new Scanner(System.in);
    n = sc.nextInt();
  System.out.println("Input exponent number: " + p );
    p = sc.nextInt();
  
    for(int i=1;i<=p;i++)
              {
                  result=n*result;
              }
      System.out.println( "raised to the power" + result );
}


}

               
