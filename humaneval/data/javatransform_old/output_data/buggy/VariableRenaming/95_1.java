public static int max_fill(int[][] var, int bucket_capacity) {
    int result = 0;
    for (int i = 0; i < var.length; i++) {
        int row_capacity = 0;
        for (int j = 0; j < var[j].length; j++) {
            row_capacity += var[j][i];
        }
        result += (row_capacity + bucket_capacity - 1) / bucket_capacity;
    }
    return result;
}
