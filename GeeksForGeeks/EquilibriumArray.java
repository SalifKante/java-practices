/*
6. Consider an array A with n of positive integers. An integer idx is called a POE (point of equilibrium) of A,
if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].
Write a function to return POE of an array, if it exists and -1 otherwise. 

The signature of the function is:
int f(int[] a)

*/

public class EquilibriumArray {
    public static void main(String[] args) {

        int[] arr = {2, 1, 1, 1, 2, 1, 7};
        // int[] arr2 = arr;
        // for (int i = 0; i < arr2.length; ++i) {
        //     System.out.println(arr2[i]);
        // }
        System.out.println(new EquilibriumArray().equilib(arr));
        System.out.println();
            
    }
    
    int equilib(int [] arr) {
        int sumLeft,sumRight;
        int i,j;

        for (i = 0; i < arr.length; ++i) {

            //get left sum
            sumLeft =0;
            for (j = 0; j < i; j++) {
                sumLeft += arr[j];
            }

            //get Right sum
            sumRight =0;
            for (j = i+1; j < arr.length; j++) {
                sumRight += arr[j];
            }

            if (sumLeft == sumRight) {
                return i;
            }

        }

        return -1;
    }
}
