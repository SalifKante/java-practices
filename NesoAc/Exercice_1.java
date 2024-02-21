import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] argrs) {
        
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter number1 operator and number2 : ");

    //     double number1 = s.nextDouble();
    //     String operator = s.next();
    //     double number2 = s.nextDouble();

    //     // System.out.println(number1);
    //     // System.out.println(operator);
    //     // System.out.println(number2);

    //     if (operator.equals("+")) 
    //         System.out.println(number1+number2);
    //     else if (operator.equals("-"))
    //         System.out.println(number1 - number2);
    //     else if(operator.equals("*"))
    //         System.out.println(number1 * number2);
    //     else
    //         System.out.println(number1/number2);
    // 
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j<=10; j++)
                System.out.print(i * j + " ");
            System.out.println();
        }
    }
}
