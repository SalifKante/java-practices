import java.util.Scanner;

//Loop
// The Fibonacci sequence is a sequence of numbers where the first two numbers in the sequence are 1.
// Then each additional Fibonacci number is the sum of the two previous numbers in the sequence: 1,1,2,3,5,8,13 ...
// Write a program that reads an integer n and display the n th Fibonacci number.
// hints : to get the n th Fibonacci You have to do n-2 steps
public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fibonacci = 0;
        for (int i = 2; i <= n; i++) {
            fibonacci += i;
            System.out.print(fibonacci + " ");
        }
    }
}
