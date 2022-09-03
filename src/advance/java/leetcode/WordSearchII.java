package advance.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {
    public static void main(String[] args) {
        char[][] mt = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oatha", "pea", "eatq", "rain"};
        System.out.println(findWords(mt, words));
    }

    public static List<String> findWords(char[][] board, String[] words) {
        List<String> output = new ArrayList<>();
        for (String word : words) {
            boolean[][] visited = new boolean[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0) && find(board, visited, i, j, 0, word)) {
                        if(!output.contains(word)) {
                            output.add(word);
                        }
                    }
                }
            }
        }
        return output;

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
