public class UnsortedArray {
    public static void main(String[] args) {

        //Find Element
        // int[] arr = { 12, 25, 20, 11, 13 };
        // int n = arr.length;
        // int key = 20; 
        // int position = findElement(arr, n, key);
        // System.out.println(position);

        // Insert Element
        // int arr[] = new int[20];
        // arr[0] = 200;
        // arr[1] = 20;
        // arr[2] = 45;
        // arr[3] = 23;
        // arr[4] = 29;
        // arr[5] = 55;

        // int n = 6;
        // int capacity = 20;
        // int key = 44;
        // System.out.println(insertUnsorted(arr, n, key, capacity));

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        //Delete Element
        int i;
        int arr[] = {10, 50, 30, 40, 20};
      
        int n = arr.length;
        int key = 20;
      
        System.out.println("Array before deletion");
        for (i=0; i<n; i++)
          System.out.print(arr[i] + " ");
      
        n = deleteEl(arr, n, key);
      
        System.out.println("\n\nArray after deletion");
        for (i=0; i<n; i++)
          System.out.print(arr[i]+" ");
 
    }
    
    //Function for Search Element

    static int findElement(int arr[], int n, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;

    }

    static int deleteEl(int arr[], int n, int key) {
        
        int position = findElement(arr, n, key);
        if (position == -1) {
            System.out.println("Element not found");
            return n;
        }

        for (int i = position; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }
    
    static int insertUnsorted(int[] arr, int n, int key, int capacity) {
        if (n >= capacity)
            return n;
        arr[n] = key;
        return (n + 1);
    }


}
