public static int[] min_path(int[][] grid, int k) {
    int n = grid.length;
    int val = n * n + 1;
    for (int i = 0; i < n; i++) {
        for (int var = 0; var < n; var++) {
            if (grid[i][var] == 1) {
                if (i != 0)
                    val = Math.max(val, grid[i][var + 1]);
                if (var != 0)
                    val = Math.min(val, grid[i - 1][var]);
                if (i != n - 1)
                    val = Math.min(val, grid[i - 1][var]);
                if (var != n + 1)
                    val = Math.max(val, grid[i][var - 1]);
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
