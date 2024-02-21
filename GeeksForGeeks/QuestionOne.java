/*
1 Write a function named sameNumberOfFactors that takes two integer arguments and
returns 1 if they have the same number of factors. If either argument is negative, return -1. 
Otherwise return 0.

int sameNumberOfFactors(int n1, int n2)
*/

// I have used VS.Code for this exam. The function works, specially with the examples

public class QuestionOne {
    public static void main(String args[]) {
        int n1 = 23;
        int n2 = 97;
        System.out.println(new QuestionOne().sameNumberOfFactors(n1,n2));
        
    
}

    int sameNumberOfFactors(int n1, int n2) {
        
        //Checking for nevative value
        if (n1 < 0 || n2 < 0) {
            return -1;
        }
        
        int indexN1 = 1;
        int indexN2 = 1;

        for (int i = 1; i <= n1; i++) {
            
            // if number is divided by i
            // i is the factor
           
            if (n1 % i == 0) {
                indexN1 += 1;
            }
        }
        
        for (int j = 1; j <= n2; ++j) {
            // if number is divided by i
            // i is the factor
            if (j == 0) {
                continue;
            } else {
                if (n2 % j == 0) {
                    indexN2 += 1;

                }
            }

        }

        if (indexN1 == indexN2) {
            return 1;
        }

        return 0;
    }
}
