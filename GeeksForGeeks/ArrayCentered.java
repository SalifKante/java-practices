/*
1.An array with an odd number of elements is said to be centered if all elements (except the middle one)
are strictly greater than the value of the middle element. Note that only arrays with an odd number of elements
have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered array,
otherwise it returns 0.
*/

public class ArrayCentered {
    public static void main(String[] args) {
        int[] b = { 3, 2, 1, 4, 5 };
        int result = arrayOd(b);

        System.out.println(result);
    }
    
    public static int arrayOd(int[] a) {
        
        if (a == null || a.length % 2 == 0)
            return 0;
        int indexMid = a.length / 2;
        int midElement = a[indexMid];

        for (int i = 0; i < a.length; i++) {
            if ( i != indexMid && midElement >= a[i]) {
                return 0;
            }
        }
        return 1;
    }
}
