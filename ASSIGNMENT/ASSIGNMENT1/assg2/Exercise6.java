import java.util.Scanner;
public class Exercise6
{
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("first input number:" );
     int num1 = in .nextInt();
    System.out.println("second input number:");
      int num2 =in.nextInt();
    System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
    System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
    System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
    System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
    System.out.println(num1 + "mod" + num2 + "=" + (num1%num2));
  
}

}
