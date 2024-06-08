public static int max_fill(int[][] grid, int bucket_capacity) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
        int row_capacity = 0;
        {
            int j = 0;
            while (j < grid[i].length) {
                row_capacity += grid[i][j];
                j++;
            }
        }
        result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
    }
    return result;
}
