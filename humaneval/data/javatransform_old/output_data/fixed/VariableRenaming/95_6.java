public static int max_fill(int[][] grid, int bucket_capacity) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
        int row_capacity = 0;
        for (int var = 0; var < grid[i].length; var++) {
            row_capacity += grid[i][var];
        }
        result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
    }
    return result;
}
