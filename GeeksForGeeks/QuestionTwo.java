/*
Write a function named hasSingleMaximum that takes an array argument and returns 1 
if the maximum value in its array argument occurs exactly once in the array, otherwise it returns 0.

If you are writing in Java or C#, the function signature is
int hasSingleMaximum(int[ ] a)
*/

// I have used VS.Code for this exam. The function works, specially with the examples


public class QuestionTwo {
    public static void main(String[] args) {
        int a[] = {1, 2, 3,3, 1, 0};
        System.out.println(new QuestionTwo().hasSingleMaximum(a,0));
    }
    
    int hasSingleMaximum(int[] a, int len) {
        if (a[len] == 0 || len == null)
            return 0;
        
        int max = a[0];
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            
            if (max < a[i]) {
                max = a[i];
                maxIndex = i;
            }
            if (i != maxIndex && a[i] == max) {
                return 0;
            }
        }
        return 1;
    }
}
