package org.example.recursion.Day1;
public class SudokuSolver {
    //input
//    String[][] sudokuGrid = {
//                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
//                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
//                {".", "9", "8", ".", ".", ".", ".", "6", "."},
//                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
//                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
//                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
//                {".", "6", ".", ".", ".", ".", "2", "8", "."},
//                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
//                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
//        };
//
//        SudokuSolver s = new SudokuSolver();
//        s.sudokuSolver(sudokuGrid);


    public void sudokuSolver(String[][] board) {

        helper(board, 0, 0);
        for (String[] strings : board) {
            for (String s : strings) {
                System.out.print(s + " ");
            }
        }

    }

    public Boolean helper(String[][] board, int row, int col) {

        //base-case
        if (row == 9) {
            return Boolean.TRUE;
        }
        if (col == 9) {
            return helper(board, row + 1, 0);

        }

        if ((board[row][col] != ".")) {
            return helper(board, row, col + 1);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, i, row, col)) {
                board[row][col] = String.valueOf(i);
                if (helper(board, row, col + 1)) {
                    return Boolean.TRUE;
                }

            }
            board[row][col] = ".";
        }
        return Boolean.FALSE;
    }

    public Boolean isSafe(String[][] board, int number, int row, int col) {

        //horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i].equalsIgnoreCase(String.valueOf(number))) {
                return Boolean.FALSE;
            }
        }

        //vertical
        for (int j = 0; j < board.length; j++) {
            if (board[j][col].equalsIgnoreCase(String.valueOf(number))) {
                return Boolean.FALSE;
            }
        }

        int intialRowi = row - row % 3;
        int initialColi = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + intialRowi][j + initialColi].equalsIgnoreCase(String.valueOf(number))) {
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }
}
