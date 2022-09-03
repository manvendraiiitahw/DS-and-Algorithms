package advance.java.leetcode.subscription.neetcode.arrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board.length != 9 && board[0].length != 9) {
            return false;
        }
        if (isRowValid(board) && isColumnValid(board)) {

            for (int i = 0; i < 9; ) {
                for (int j = 0; j < 9; ) {
                    if (!isBlockValid(board, i, j)) {
                        return false;
                    }
                    j = j + 3;
                }
                i = i + 3;

            }
            return true;

        }

        return false;
    }

    boolean isBlockValid(char[][] board, int m, int n) {
        Set<Character> bSet = new HashSet<>();
        for (int i = m; i < m + 3; i++) {
            for (int j = n; j < n + 3; j++) {
                if (board[i][j] != '.') {
                    if (bSet.contains(board[i][j])) {
                        return false;
                    } else {
                        bSet.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }

    boolean isRowValid(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> bSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (bSet.contains(board[i][j])) {
                        return false;
                    } else {
                        bSet.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }

    boolean isColumnValid(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> bSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (bSet.contains(board[j][i])) {
                        return false;
                    } else {
                        bSet.add(board[j][i]);
                    }
                }
            }
        }
        return true;
    }
}
