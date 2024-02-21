import java.util.Scanner;

// Loop
// A program which display the reverse of a string

public class Exercise9 {
    public static void main(String[] argrs) {
        System.out.println(" enter a string :");
        Scanner s = new Scanner(System.in);
        String chaine = s.nextLine();

        for (int i = chaine.length() - 1; i >= 0; i--) {
            System.out.print(chaine.charAt(i) + "");
        }
    }
}
