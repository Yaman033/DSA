package org.example.recursion.Day1;

import java.util.ArrayList;
import java.util.List;

public class RatInTheMaze {


    //sample input
    //    public static void main(String[] args) {
    //
    //        int[][] m = {
    //                {1, 0, 0, 0},
    //                {1, 1, 0, 1},
    //                {1, 1, 0, 0},
    //                {0, 1, 1, 1}
    //        };
    //
    //        int[][] helperMatrix = {
    //                {0, 0, 0, 0},
    //                {0, 0, 0, 0},
    //                {0, 0, 0, 0},
    //                {0, 0, 0, 0}
    //        };
    //        RatInTheMaze rm = new RatInTheMaze();
    //        rm.ratInTheMaze(4,m,helperMatrix);
    //
    //    }
    //}

    public void ratInTheMaze(int n, int[][] m, int[][] helperMatrix) {

        List<String> path = new ArrayList<>();
        helper(m, n, 0, 0, path, "", helperMatrix);
        System.out.println(path);
    }

    public void helper(int[][] m, int n, int row, int col, List<String> path, String ans, int[][] helperMatrix) {

        //base case
        if (row == n - 1 && col == n - 1) {
            path.add(ans);
            return;
        }
        helperMatrix[row][col] = 1;
        if (isSafe(row + 1, col, m, helperMatrix)) {
            helper(m, n, row + 1, col, path, ans + "D", helperMatrix);

        }
        if (isSafe(row, col + 1, m, helperMatrix)) {
            helper(m, n, row, col + 1, path, ans + "R", helperMatrix);

        }
        if (isSafe(row, col - 1, m, helperMatrix)) {
            helper(m, n, row, col - 1, path, ans + "L", helperMatrix);
        }
        if (isSafe(row - 1, col, m, helperMatrix)) {
            helper(m, n, row - 1, col, path, ans + "U", helperMatrix);
        }
        //backtracking
        helperMatrix[row][col] = 0;
    }

    public Boolean isSafe(int i, int j, int[][] m, int[][] helperMatrix) {
        if (i >= 0 && j >= 0 && i < m.length && j < m.length && m[i][j] == 1 && helperMatrix[i][j] == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
