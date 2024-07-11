public static int[] pluck(int[] var) {
    int min_even = Integer.MAX_VALUE;
    int index = -1;
    for (int i = 0; i < var.length; i += 1) {
        if (var[i] % 2 == 0 && var[i] < min_even) {
            min_even = var[i];
            index = i;
        }
    }
    if (index == -1)
        return new int[] {};
    return new int[] { min_even, index };
}
