class Solution {
    private boolean dfs(char[][] board, boolean[][] visited, StringBuilder word, int i, int j){
        if (i < 0 || i >= board.length) return false;
        if (j < 0 || j >= board[i].length) return false;
        if (visited[i][j]) return false;
        if (word.charAt(0) != board[i][j]) return false;
        visited[i][j] = true;
        word.deleteCharAt(0);
        if (word.length() == 0) return true;
        boolean found =  dfs(board, visited, new StringBuilder(word), i, j-1) || dfs(board, visited, new StringBuilder(word), i, j+1) || dfs(board, visited, new StringBuilder(word), i-1, j) || dfs(board, visited, new StringBuilder(word), i+1, j);
        visited[i][j] = false;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                boolean[][] visited = new boolean[board.length][board[0].length];
                StringBuilder sb = new StringBuilder(word);
                if (dfs(board, visited, sb, i, j)) return true;
            }
        }
        return false;
    }
}