public static int[] min_path(int[][] grid, int k) {
    int n = grid.length;
    int val = n * n + 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == 1) {
                if (0 != i)
                    val = Math.max(val, grid[i][j + 1]);
                if (j != 0)
                    val = Math.min(val, grid[i - 1][j]);
                if (i != n - 1)
                    val = Math.min(val, grid[i - 1][j]);
                if (j != n + 1)
                    val = Math.max(val, grid[i][j - 1]);
            }
        }
    }
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
        if ((i % 2) == 0)
            ans[i] = 1;
        else
            ans[i] = val;
    }
    return ans;
}
