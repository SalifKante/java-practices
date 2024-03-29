/*
Write a function that takes an array of integers as an argument and returns a value based on
the sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array
and let Y = the sum of the even numbers. The function should return X – Y

The signature of the function is:
int f(int[ ] a)
*/
public class ArraySumOddEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,5 };
        System.out.println(sumOddEven(arr));
    }
    
    static int sumOddEven(int arr[]) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                sumOdd += arr[i];
            } else {
                sumEven += arr[i];
            }
        }
        
        return sumOdd - sumEven;
    }
}
