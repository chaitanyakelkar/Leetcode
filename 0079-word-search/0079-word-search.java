class Solution {
    private boolean dfs(char[][] board, boolean[][] visited, String word, int index, int i, int j){
        if (i < 0 || i >= board.length) return false;
        if (j < 0 || j >= board[i].length) return false;
        if (visited[i][j]) return false;
        if (word.charAt(index) != board[i][j]) return false;
        visited[i][j] = true;
        index++;
        if (index == word.length()) return true;
        boolean found =  dfs(board, visited, word, index, i, j-1) || dfs(board, visited, word, index, i, j+1) || dfs(board, visited, word, index, i-1, j) || dfs(board, visited, word, index, i+1, j);
        visited[i][j] = false;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                boolean[][] visited = new boolean[board.length][board[0].length];
                if (dfs(board, visited, word, 0, i, j)) return true;
            }
        }
        return false;
    }
}