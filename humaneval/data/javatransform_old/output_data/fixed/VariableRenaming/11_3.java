public static int[] min_path(int[][] grid, int k) {
    int var = grid.length;
    int val = var * var + 1;
    for (int i = 0; i < var; i++) {
        for (int j = 0; j < var; j++) {
            if (grid[i][j] == 1) {
                if (i != 0)
                    val = Math.min(val, grid[i - 1][j]);
                if (j != 0)
                    val = Math.min(val, grid[i][j - 1]);
                if (i != var - 1)
                    val = Math.min(val, grid[i + 1][j]);
                if (j != var - 1)
                    val = Math.min(val, grid[i][j + 1]);
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
