import java.util.Scanner;

import javafx.scene.effect.Light.Point;

public class Loop14 {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // 1.

        // for (int i = 1; i <= n; i++) {
        //     System.out.println();
        //     for(int j =1; j<=n; j++)
        //         System.out.print("#");
        // }

        
        // 2.
        // for (int i = 1; i <= n; i++) {
        //     System.out.println();
        //     for (int k = 1; k <= n; k++) {
        //         if (i == 1 || i == n)
        //             System.out.print("*");
        //         else if (k == 1 || k == n)
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        // }

        // 3.

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n)
                    System.out.print("*");
                else if (k == 1 || k == n)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
        }

        // Point p = new Point();
    }
}
