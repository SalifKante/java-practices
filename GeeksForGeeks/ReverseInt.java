/*
Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.

The signature of the function is:
int f(int n)
*/

public class ReverseInt {
    public static void main(String args[]) {
        System.out.println(reversedNum(987));
    }

    static int reversedNum(int input) {
        int reversedNum = 0;
        while (input > 0) {
            reversedNum = input%10 + reversedNum * 10;
            input = input/10;
        }
        return reversedNum;
    }

}
