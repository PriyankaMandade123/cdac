import java.util.Scanner;
  public class Swap{
     public static void main(String args[]){
     int x,y,z;
     Scanner in = new Scanner(System.in);
     System.out.println("input first number");
      x = in.nextInt();
     System.out.println("input second number");
      y = in.nextInt();
      
       z=x;
       x=y;
       y=z;
      System.out.println("Swapped values are:"+ x + "and" +y);
}
}

    