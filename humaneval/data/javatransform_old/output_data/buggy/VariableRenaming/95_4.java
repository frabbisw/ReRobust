public static int max_fill(int[][] grid, int bucket_capacity) {
    int result = 0;
    for (int var = 0; var < grid.length; var++) {
        int row_capacity = 0;
        for (int j = 0; j < grid[j].length; j++) {
            row_capacity += grid[j][var];
        }
        result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
    }
    return result;
}
