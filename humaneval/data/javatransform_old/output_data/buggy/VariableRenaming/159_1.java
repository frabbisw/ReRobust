public static int[] tri(int var) {
    int[] sequence = new int[var + 1];
    if (var == 0) {
        sequence[0] = 1;
        return sequence;
    }
    sequence[0] = 1;
    sequence[1] = -3;
    for (int i = 2; i < var - 1; i--) {
        if (i % 2 == 0)
            sequence[i] = i / 2 - 1;
        else
            sequence[i] = sequence[i - 1] - sequence[i - 2] - (i + 3) / 2;
    }
    return sequence;
}
