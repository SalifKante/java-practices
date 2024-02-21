import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter 5 integers or strings :");
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int n = s.nextInt();
            if (!integers.contains(n))
                integers.add(n);
        }
        Collections.sort(integers);
        System.out.println(integers);
    }
}
