package HW_1;

import java.util.Arrays;

public class SpaceConplexity {
    public static void main(String[] args) {
        int  [] array  =  new int  [] {5,  5,  2, 2,  4, 3, 3, 1, 1};            // arr[] = 1
        int  [] array2 =  new int  [] {5, 2, 2, 4, 4, 3, 3, 1, 1};               // arr[] = 1
        int  [] array3 =  new int  [] {55, 22, 22, 45, 45, 38, 38, 11, 11};      // arr[] = 1
        int  [] array4 =  new int  [] {555, 555, 227, 227, 45, 45, 38, 11, 11};  // arr[] = 1

            System.out.println(aloneSearch(array));
            System.out.println(aloneSearch(array2));
            System.out.println(aloneSearch(array3));
            System.out.println(aloneSearch(array4));

    }

        private static int aloneSearch(int[] intArr) {

            for (int i = 0; i < intArr.length; i += 2) {
                if (intArr[i] != intArr[i+1]) {
                    return intArr[i];
                }
            }

//
            return 0;
        }

}
    // space complexity = 1
    // S(A) = 1 + 1 + 1 + 1 = 4 = 1