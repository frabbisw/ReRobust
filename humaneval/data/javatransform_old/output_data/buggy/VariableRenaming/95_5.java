public static int max_fill(int[][] grid, int bucket_capacity) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
        int var = 0;
        for (int j = 0; j < grid[j].length; j++) {
            var += grid[j][i];
        }
        result += (var + bucket_capacity - 1) / bucket_capacity;
    }
    return result;
}
