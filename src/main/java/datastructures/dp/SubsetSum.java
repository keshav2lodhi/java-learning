package datastructures.dp;

/**
 * Find the sub set sum from a set/array
 **/
public class SubsetSum {
    // Return true if there exists a subarray of array with given sum
    public static boolean subsetSum(int[] A, int sum) {
        int n = A.length;

        // T[i][j] stores true if subset with sum j can be attained
        // with using items up to first i items
        boolean[][] T = new boolean[n + 1][sum + 1];

        // if sum is zero
        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
        }

        // do for ith item
        for (int i = 1; i <= n; i++) {
            // consider all sum from 1 to sum
            for (int j = 1; j <= sum; j++) {
                // don't include ith element if j-A[i-1] is negative
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j]; // Take the value from the top
                } else {
                    // find subset with sum j by excluding or including
                    // the ith item
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }

        // return maximum value
        return T[n][sum];
    }

    public static void main(String[] args) {
        // Input: set of items and a sum
        int[] A = {7, 3, 2, 5, 8};
        int sum = 18;

        if (subsetSum(A, sum))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
