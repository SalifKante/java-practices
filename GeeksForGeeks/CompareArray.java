/*
5.Write a function to return an array containing all elements common to two given arrays containing distinct positive
integers. You should not use any inbuilt methods. You are allowed to use any number of arrays.

The signature of the function is:
int[] f(int[] first, int[] second)
*/

public class CompareArray {
    public static void main(String[] args) {
        int arr11[] = { 1, 2 };
        int arr22[] = { 1, 2, 3, 4 };
        
        //int[] a = new int[0];
        //System.out.println(a.length);
        
        int[] res = compArr(arr11, arr22);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
    }

    static int[] compArr(int[] arr1, int[] arr2) {
        if(arr1 == null || arr2 == null) return null;
        if (arr1.length == 0 || arr2.length == 0)
            return new int[0];
        int minLength = (arr1.length < arr2.length) ? arr1.length : arr2.length;
        int [] a,b;

        if(minLength == arr1.length){
            a = arr1;
            b = arr2;
        }
        else{
            a = arr2;
            b = arr1;
        }

        int [] c = new int [minLength];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++){
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                }
            }  
        }
        int [] retArray = new int[k];
        for (int t =0; t<retArray.length; t++)
            retArray[t] = c[t];
        return retArray;
    }
}
