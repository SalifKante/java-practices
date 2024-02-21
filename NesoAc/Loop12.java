import java.util.Scanner;

// Loop
// 

public class Loop12 {
    public static void main(String[] args) {
        System.out.println("enter a positive integer :");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // if (n<=0) {
        //     System.out.println("Please give a positive number");
        // } else {
        //     for (int i = 1; i <= n; i++) {
        //         System.out.println();
        //         for (int j = 1; j <= n - i; j++) {
        //             System.out.print(" ");
        //         }
        //         for (int k = 1; k <= i; k++) {
        //             System.out.print("*");
        //         }
        //     }
        // }
            if (n<=0) {
            System.out.println("Please give a positive number");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println();
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2*i-1; k++) {
                    System.out.print("*");
                    
                }
            }
        }
    }
}
