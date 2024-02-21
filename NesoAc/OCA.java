import java.util.ArrayList;
import java.util.List;

public class OCA {
  
 private static int $;
    public static void main(String[] main) {
        // boolean keepGoing = true;
        // int count = 0;
        // int x = 3;
        // while (count++ < 3) {
        //     int y = (1 + 2 * count) % 3;
        //     switch (y) {
        //         default:
        //         case 0:
        //             x -= 1;
        //             break;
        //         case 1:
        //             x += 5;
        //     }
        // }
        // System.out.println(x);


        // System.out.print("a");
        // try {
        //     System.out.print("b");
        //     //throw new IllegalArgumentException();
        // } catch (Exception e) {
        //     System.out.print("c");
        // } finally {
        //     System.out.print("d");
        // }
        //  System.out.print("e");
        /* 
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        //list.remove(0);
        System.out.println(list);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        //numbers.forEach( (n) -> { System.out.println(n); } );
        System.out.println(numbers);
        System.out.println(array.toString());*/
        int a = 15;
        int b = 10;
        //System.out.println(OCA.addToInt(a, b));
        OCA.addToInt(a, b);
        System.out.println(a); 
    }
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }
}
        