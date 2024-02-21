public class GivenArray {
    public static void main(String args[]) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        //int x = 9;
        //System.out.println(new GivenArray().givenArr(arr, x));
        // System.out.println(new GivenArray().triplet(arr, x));
        System.out.println(new GivenArray().majorityEl(arr));

        

    }
    
    int givenArr(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == x || arr[j] == x || arr[i] + arr[j] == x) {
                    //System.out.println(arr[i] + " + " + arr[j] + " = " + x);
                    return x;
                }
        return -1;

    }
    
    boolean triplet(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                for (int k = i + 2; k < arr.length; k++)
                    if (arr[i] == x || arr[j] == x || arr[k] == x || arr[i] + arr[j] + arr[k] == x) {
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + x);
                        return true;
                    }
        return false;
    }
    
    int majorityEl(int[] arr) {
        int maxCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        if (maxCount > arr.length/2) {
            return arr[maxCount];
        }
        return -1;
    }
}
