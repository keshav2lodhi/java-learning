package datastructures.dp;

/**
 * Longest Common Subsequence problem
 **/
public class LCS {

    public static void main(String[] args) {

        LCS lcs = new LCS();

        String s1 = "abcdaf";
        String s2 = "acbcf";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int m = arr1.length;
        int n = arr2.length;
        System.out.println("m:---> " + m + ", and n:---> " + n);
        int result = lcs.lcs(arr1, arr2, m, n);
        System.out.println("@@@@result:---> " + result);
    }

    int lcs(char[] arr1, char[] arr2, int m, int n) {

        int L[][] = new int[m + 1][n + 1];
        System.out.println("@@@@@Length of L:---> " + L.length);

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (arr1[i - 1] == arr2[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i][j - 1], L[j][i - 1]);
                }
            }
        }
        return L[m][n];
    }

}
