public class ElementOnce {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        int n = arr.length;
        System.out.println("Element occurring once is " +
                            findSingleElement(arr, n) + " ");
    }
    
    static int findSingleElement(int [] arr, int n){
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
