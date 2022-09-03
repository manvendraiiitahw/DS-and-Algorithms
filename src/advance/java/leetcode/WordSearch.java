package advance.java.leetcode;

public class WordSearch {
    public static void main(String[] args) {
        char[][] mt = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist(mt, "SEE"));
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && find(board, visited, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean find(char[][] board, boolean[][] visited, int i, int j, int k, String word) {
        if (k == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(k) || visited[i][j]) {
            return false;
        }
        visited[i][j] = true;
        if (find(board, visited, i + 1, j, k + 1, word) || find(board, visited, i - 1, j, k + 1, word) || find(board, visited, i, j + 1, k + 1, word) ||
                find(board, visited, i, j - 1, k + 1, word)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
