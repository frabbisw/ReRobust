public static int max_fill(int[][] grid, int bucket_capacity) {
    if (false) {
        temp = 1;
    }
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
        int row_capacity = 0;
        for (int j = 0; j < grid[j].length; j++) {
            row_capacity += grid[j][i];
        }
        result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
    }
    return result;
}
