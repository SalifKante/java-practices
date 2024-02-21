import java.util.Scanner;

// A progran that read a sequence of positive number from a user and stop when 
// the user enter a negative number and display the maximum and minimum of that numbers

public class Loop5 {
    public static void main(String[] args) {
        int n;
        System.out.println("enter a number :");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int max = n;
        int min = n;

        while (true) {
            n = s.nextInt();

            if(n<0)
                break;
            if(max<n)
                max = n;
            if(min>n)
                min = n;
            
        }
        System.out.println("max = "+ max + " min = " + min);
         
    }
}
