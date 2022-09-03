package advance.java.leetcode.subscription.backtrack;

public class PlaceNQueens {
    static int n = 4;
    int[][] chess = new int[n][n];

    public static void main(String[] args) {
        PlaceNQueens placeNQueens = new PlaceNQueens();
        System.out.println(placeNQueens.placeQueens(0, n, 0));
    }

    int placeQueens(int row, int n, int cnt) {
        for (int i = 0; i < n; i++) {
            if (placeIsUnderAttack(row, i)) {
                placeQueen(row, i);
                if (row + 1 == n) {
                    cnt++;
                } else {
                    cnt = placeQueens(row + 1, n, cnt);
                }
                removeQueen(row, i);
            }
        }
        return cnt;
    }

    void placeQueen(int i, int j) {
        chess[i][j] = 1;
    }

    void removeQueen(int i, int j) {
        chess[i][j] = 0;
    }

    boolean placeIsUnderAttack(int i, int j) {
        return checkRowUp(chess, i, j) && checkRowDown(chess, i, j) && checkColumnsUp(chess, i, j) &&
                checkColumnsDown(chess, i, j) && checkHillDiagonalDown(chess, i, j)
                && checkHillDiagonalUp(chess, i, j) && checkDaleDiagonalUp(chess, i, j) && checkDaleDiagonalDown(chess, i, j);
    }

    private boolean checkDaleDiagonalDown(int[][] chess, int i, int j) {
        if (i < 4 && j < 4 && chess[i][j] != 1) {
            return checkDaleDiagonalDown(chess, i + 1, j + 1);
        }
        return i == 4 && j == 4;
    }

    private boolean checkDaleDiagonalUp(int[][] chess, int i, int j) {
        if (i >= 0 && j >= 0 && chess[i][j] != 1) {
            return checkDaleDiagonalUp(chess, i - 1, j - 1);
        }
        return i == 0 && j == 0;
    }

    private boolean checkHillDiagonalUp(int[][] chess, int i, int j) {
        if (i >= 0 && j < 4 && chess[i][j] != 1) {
            return checkHillDiagonalUp(chess, i - 1, j + 1);
        }
        return i == 0 && j == 4;
    }

    private boolean checkHillDiagonalDown(int[][] chess, int i, int j) {
        if (i < 4 && j >= 0 && chess[i][j] != 1) {
            return checkHillDiagonalDown(chess, i + 1, j - 1);
        }
        return i == 4 && j == 0;
    }

    private boolean checkColumnsDown(int[][] chess, int i, int j) {
        if (i < 4 && chess[i][j] != 1) {
            return checkColumnsDown(chess, i + 1, j);
        }
        return i == 4;
    }

    private boolean checkColumnsUp(int[][] chess, int i, int j) {
        if (i >= 0 && chess[i][j] != 1) {
            return checkColumnsUp(chess, i - 1, j);
        }
        return i == 0;
    }

    private boolean checkRowDown(int[][] chess, int i, int j) {
        if (j >= 0 && chess[i][j] != 1) {
            return checkRowDown(chess, i, j - 1);
        }
        return j == 0;
    }

    private boolean checkRowUp(int[][] chess, int i, int j) {
        if (j < 4 && chess[i][j] != 1) {
            return checkRowUp(chess, i, j + 1);
        }
        return j == 4;
    }
}
