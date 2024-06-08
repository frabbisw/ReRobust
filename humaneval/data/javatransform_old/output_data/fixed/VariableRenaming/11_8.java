public static int[] min_path(int[][] grid, int k) {
    int n = grid.length;
    int val = n * n + 1;
    for (int var = 0; var < n; var++) {
        for (int j = 0; j < n; j++) {
            if (grid[var][j] == 1) {
                if (var != 0)
                    val = Math.min(val, grid[var - 1][j]);
                if (j != 0)
                    val = Math.min(val, grid[var][j - 1]);
                if (var != n - 1)
                    val = Math.min(val, grid[var + 1][j]);
                if (j != n - 1)
                    val = Math.min(val, grid[var][j + 1]);
            }
        }
    }
    int[] ans = new int[k];
    for (int var = 0; var < k; var++) {
        if ((var % 2) == 0)
            ans[var] = 1;
        else
            ans[var] = val;
    }
    return ans;
}
