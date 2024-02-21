public class SumOdEven {

    public static void main(String[] args) {
        int[] arr = { 2,3,1,4,5};
        int res = arrayOdEven(arr);
        System.out.println(res);
    }

   
    
    static int arrayOdEven(int arr[]) {
        int sumEven = 0;
        int sumOdd= 0;


        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 != 0) {
                sumOdd += arr[i];
            }
            else {
                sumEven += arr[i];
            }
        }
        return sumOdd - sumEven;
    }   
}
