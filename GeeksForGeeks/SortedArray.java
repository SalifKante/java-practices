public class SortedArray {
    public static void main(String[] args) {

        //Binary Search
        // int arr[] = { 5, 6, 7, 8, 9, 10 };
        // int n, key;
        // n = arr.length - 1;
        // key = 10;
        // System.out.println("Index: " + binarySearch(arr, 0, n, key));

        //Insert
        // int arr[] = new int[20];
        // arr[0] = 12;
        // arr[1] = 16;
        // arr[2] = 20;
        // arr[3] = 40;
        // arr[4] = 50;
        // arr[5] = 70;
        // int capacity = arr.length;
        // //System.out.println(capacity); = 20
        // int n = 6;
        // int key = 26;
 
        // System.out.print("\nBefore Insertion: ");
        // for (int i = 0; i < n; i++)
        //     System.out.print(arr[i] + " ");
 
        // // Inserting key
        // n = insertSorted(arr, n, key, capacity);
 
        // System.out.print("\nAfter Insertion: ");
        // for (int i = 0; i < n; i++)
        //     System.out.print(arr[i] + " ");

        // Delete
        int i;
        int arr[] = { 10, 20, 30, 40, 50 };
 
        int n = arr.length;
        int key = 30;
 
        System.out.print("Array before deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 
        n = deleteElement(arr, n, key);
 
        System.out.print("\n\nArray after deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
    //Binary Search
    static int binarySearch(int arr[], int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > mid)
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    //Insert Sorted in an array
    static int insertSorted(int arr[], int n, int key, int capacity) {
        if (n >= capacity) {
            return n;
        }
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
            arr[i + 1] = arr[i];
        arr[i + 1] = key;

        return n + 1;
    }

    // Delete
    static int deleteElement(int arr[], int n, int key) {

        // Find position of element to be deleted
        int pos = binarySearch(arr, 0, n - 1, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        
        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
 
        return n - 1;
    }

    
}
