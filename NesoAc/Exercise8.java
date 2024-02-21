import java.util.Scanner;

// Loop
// A program which display a string with a space beetween after each character

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("enter a string : ");
        Scanner s = new Scanner(System.in);
        String chaine = s.nextLine();

        for (int i = 0; i <= chaine.length()-1; i++) {
            System.out.print(chaine.charAt(i) + " ");
        }
        
    }
}
