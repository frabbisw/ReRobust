public static int[] min_path(int[][] grid, int k) {
    int n = grid.length;
    int var = n * n + 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == 1) {
                if (i != 0)
                    var = Math.min(var, grid[i - 1][j]);
                if (j != 0)
                    var = Math.min(var, grid[i][j - 1]);
                if (i != n - 1)
                    var = Math.min(var, grid[i + 1][j]);
                if (j != n - 1)
                    var = Math.min(var, grid[i][j + 1]);
            }
        }
    }
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
        if ((i % 2) == 0)
            ans[i] = 1;
        else
            ans[i] = var;
    }
    return ans;
}
