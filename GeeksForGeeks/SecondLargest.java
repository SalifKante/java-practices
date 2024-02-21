/*
1. Write a function that accepts an array of non-negative integers and returns
the second largest integer in the array. Return -1 if there is no second largest.

The signature of the function is
int f(int[ ] a)
*/
public class SecondLargest {
    public static void main(String[] argrs) {
        int arr []= {4,4};
        System.out.println(secondL(arr));
        //secondL(arr);
    }
    
    static int secondL(int[] arr) {
        int secondMax;
        int max = secondMax = Integer.MIN_VALUE;
        // int max = arr[0];
        // int secondMax = arr[1];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (max != arr[i]) {
                secondMax = Math.max(secondMax, arr[i]);
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }
        
        return secondMax;
    }
    
}
