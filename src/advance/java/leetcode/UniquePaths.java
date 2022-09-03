package advance.java.leetcode;

public class UniquePaths {
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(uniquePathsIII(grid));
    }

    public static int uniquePathsIII(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int output = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && find(grid, visited, i, j)) {
                    boolean flag = false;
                    for (int a = 0; a < grid.length; a++) {
                        for (int b = 0; b < grid[0].length; b++) {
                            if (!(visited[a][b] && grid[a][b] != 1 && grid[a][b] != 2 && grid[a][b] != -1)) {
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        output++;
                    }
                }
            }
        }

        return output;
    }

    public static boolean find(int[][] board, boolean[][] visited, int i, int j) {

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == -1) {
            return false;
        }
        if (board[i][j] == 2) {
            return true;
        }
        visited[i][j] = true;
        System.out.println(i+"  "+j);
        if (find(board, visited, i + 1, j) || find(board, visited, i - 1, j) || find(board, visited, i, j + 1) ||
                find(board, visited, i, j - 1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
