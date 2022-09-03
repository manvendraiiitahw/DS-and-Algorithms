package com.learn.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidateSudoku {
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

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {
                        '6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {
                        '.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {
                        '8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {
                        '4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {
                        '7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {
                        '.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {
                        '.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {
                        '.', '.', '.', '.', '8', '.', '.', '7', '9'
                }
        };
        ValidateSudoku validateSudoku = new ValidateSudoku();
        System.out.println(validateSudoku.isValidSudoku(board));

    }
}
