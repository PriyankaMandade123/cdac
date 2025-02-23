import java.util.Scanner;
public class Exercise11 {

    
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
   
   
  if (num1 > num2)
   if (num1 > num3)
    System.out.println("The larest: " + num1);
   
  if (num2 > num1)
   if (num2 > num3)
    System.out.println("The largest: " + num2);
   
  if (num3 > num1)
   if (num3 > num2)
    System.out.println("The largest: " + num3);
 }
}
