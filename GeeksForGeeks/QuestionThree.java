/*
An array a is defined to be self-referential if for i=0 to a.length-1, 
a[i] is the count of the number of times that the value i appears in the array.
As the following table indicates, {1, 2, 1, 0} is a self-referential array
Write a function named isSelfReferential that returns 1 if its array argument is self-referential,
otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isSelfReferential(int[ ] a)
*/

// I have used VS.Code for this exam. The function works, especially with the examples

public class QuestionThree {
    public static void main(String[] args) {
        int[] a = {2, 0, 0};
        System.out.println(new QuestionThree().isSelfReferential(a));
    }
    
    int isSelfReferential(int[] a) {
        if (a.length == 0)
            return 0;
        int index = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    index += j;
                    //return index;
                }
            }
            if (a[i] == index) {
                return 1;
            }
        }
        
        return 0;
    }
}
