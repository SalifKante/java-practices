import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number(Float Type)");
        float d = scanner.nextFloat();

        System.out.println("Enter a decimal number(Double Type)");
        double d1 = scanner.nextDouble();

        double result = d + d1;

        System.out.println("The result is " + result);
        System.out.println( "The object type is: " + ((Object)result).getClass().getName());
    }
}