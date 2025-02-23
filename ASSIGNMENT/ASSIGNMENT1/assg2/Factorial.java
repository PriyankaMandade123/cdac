import java.util.Scanner;
class Factorial{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      int n,fact =1;     
      System.out.println("input a number :");
       n=sc.nextInt();
            while (n>1) {
                         fact= fact*n;
                             n=n-1;
              }
  
      System.out.println("factorial of a number :" +fact);

}
}