import java.util.Scanner;

//Loop
// A program which display the sum of digits of an integer number read from the user


public class Loop6 {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (n>0) {
            sum += (n % 10);
            n = (n / 10);
        }
        System.out.println(sum);
        
    }
}
