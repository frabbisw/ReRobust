public static int max_fill(int[][] grid, int bucket_capacity) {
    int result = 0;
    {
        int i = 0;
        while (i < grid.length) {
            int row_capacity = 0;
            for (int j = 0; j < grid[j].length; j++) {
                row_capacity += grid[j][i];
            }
            result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
            i++;
        }
    }
    return result;
}
