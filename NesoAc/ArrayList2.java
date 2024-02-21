import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");

        System.out.println("");
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int choice;
        int numbers;

        do {
            System.out.print("Your choice : ");
            choice = s.nextInt();
            if (choice == 1) {
                System.out.print("Enter an integer : ");
                numbers = s.nextInt();
                integers.add(numbers);
                System.out.println("Added");
            }
            if (choice == 2) {
                System.out.print("Enter an integer to remove : ");
                int elementToRemove = s.nextInt();

                if (!integers.contains(elementToRemove))
                    System.out.println("Not found");
                else
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed ");
            }
            
            if (choice == 3) {
                System.out.print("Your list : ");
                System.out.println(integers.toString());
            }
            
            if(choice == 4){
                System.out.print("Bye");
                break;
            }
            
        } while (true);


    }
}
