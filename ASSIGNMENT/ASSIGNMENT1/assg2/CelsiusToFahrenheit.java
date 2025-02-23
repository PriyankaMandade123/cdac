
import java.util.Scanner;
public class CelsiusToFahrenheit {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input temperature in celsius: ");
        double celsius = input.nextDouble();

        double  fahrenheit =( celsius*9/5)+32;
        System.out.println(celsius + " degree celsius is equal to " + fahrenheit + " in fahrenheit");
    }
}