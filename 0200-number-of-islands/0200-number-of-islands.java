class Solution {
    boolean[][] visited;

    private void dfs(char[][] grid, int i, int j){
        if (i < 0 || i >= grid.length) return;
        if (j < 0 || j >= grid[0].length) return;
        if (grid[i][j] == '0' || visited[i][j]) return;
        visited[i][j] = true;
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }

    public int numIslands(char[][] grid) {
        int islands = 0;
        visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[i].length; j++)
                if (grid[i][j] == '1' && !visited[i][j]){
                    islands++;
                    dfs(grid, i, j);
                }
        return islands;
    }
}