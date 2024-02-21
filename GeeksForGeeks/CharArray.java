/*Write a function that accepts a character array,a zero-based start position and a length.
It should return a character array containing containing length characters starting with the start character of the input array.
The function should do error checking on the start position and the length and return null if the either value is not legal.

The function signature is:
char[ ] f(char[ ] a, int start, int len)
*/
public class CharArray {
    public static void main(String [] args) {
        char [] arr = new char [] {'a','b','c','d'};
        
        System.out.println(chaArr(arr, 0, 5));
    }
    
    static char[] chaArr(char[] arr, int start, int size) {
        try {
            if (start < 0 || size < 0 || start+ size- 1 >= arr.length);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        char[] sub = new char[size];
        for(int i=start,j=0; j<size; i++,j++){
            sub[j] = arr[i];
        }
        return sub;
    }
}
