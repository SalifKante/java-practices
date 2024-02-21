import java.util.Arrays;

public class Tiger {
    String name;

    public static void main(String[] args) {
        //int[] numbers = new int[10];
        // for (int i = 0; i < numbers.length; i++)
        //     System.out.println(numbers[i] = i + 5);
        // System.out.println("Length : " +numbers.length);

        //numbers[10] = 3;
        //System.out.println("10th : " +numbers[10]);
        //numbers[numbers.length] = 5;
        // System.out.println("Length : " +numbers.length);
        // for (int i = 0; i < numbers.length; i++)
        //     System.out.println(numbers[i] = i + 5);
        int[] numbers = { 3, 2, 1 };
        System.out.println(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 1));

        int[][] twoD = {{2,3,1},{0,5,4},{3,6,4}};
        
        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}