public static int max_fill(int[][] grid, int bucket_capacity) {
    int var = 0;
    for (int i = 0; i < grid.length; i++) {
        int row_capacity = 0;
        for (int j = 0; j < grid[i].length; j++) {
            row_capacity += grid[i][j];
        }
        var += (row_capacity + bucket_capacity - 1) / bucket_capacity;
    }
    return var;
}
