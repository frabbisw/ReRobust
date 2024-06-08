public static int max_fill(int[][] grid, int bucket_capacity) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
        int var = 0;
        for (int j = 0; j < grid[i].length; j++) {
            var += grid[i][j];
        }
        result += (var + bucket_capacity - 1) / bucket_capacity;
    }
    return result;
}
