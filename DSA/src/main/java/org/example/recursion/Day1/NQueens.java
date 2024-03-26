package org.example.recursion.Day1;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public List<List<String>> nQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] boards = new char[n][n];
        helper(allBoards, boards, n, 0);
        System.out.println(allBoards);
        return allBoards;
    }


    public void helper(List<List<String>> allBoards, char[][] boards, int n, int col) {

        //base case
        if (col == n) {
            //save board
            saveBoard(boards, allBoards);
            return;
        }

        for (int row = 0; row < boards.length; row++) {
            if (isSafe(boards, row, col)) {
                boards[row][col] = 'Q';
                helper(allBoards, boards, n, col + 1);

                //back track
                boards[row][col] = '.';

            }
        }
    }

    public Boolean isSafe(char[][] boards, int row, int col) {

        //horizontal safe
        for (int i = 0; i < boards.length; i++) {
            if (boards[row][i] == 'Q') {
                return Boolean.FALSE;
            }
        }

        //vertical safe
        for (int i = 0; i < boards.length; i++) {
            if (boards[i][col] == 'Q') {
                return Boolean.FALSE;
            }
        }

        //upper-left safe
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (boards[r][c] == 'Q') {
                return Boolean.FALSE;
            }
        }

        //upper-right safe
        r = row;
        for (int c = col; c < boards.length && r >= 0; c++, r--) {
            if (boards[r][c] == 'Q') {
                return Boolean.FALSE;
            }
        }

        //lower-left safe
        r = row;
        for (int c = col; c >= 0 && r < boards.length; c--, r++) {
            if (boards[r][c] == 'Q') {
                return Boolean.FALSE;
            }
        }

        //lower-right safe
        r = row;
        for (int c = col; c < boards.length && r < boards.length; c++, r++) {
            if (boards[r][c] == 'Q') {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }
}
