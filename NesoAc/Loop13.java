// Loop


import java.util.Scanner;

public class Loop13 {
    public static void main(String[] args) {
        
        System.out.println("enter a positive integer :");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if (n<=0) {
            System.out.println("Please give a positive number");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println();
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2*i-1; k++) {
                    if(n == i)
                        System.out.print("*");
                    else
                        if(k == 1 || k == 2*i-1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                }
            }
        }
    }
}
