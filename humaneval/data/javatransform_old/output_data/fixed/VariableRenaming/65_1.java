public static boolean triples_sum_to_zero(int[] var) {
    for (int i = 0; i < var.length; i += 1) {
        for (int j = i + 1; j < var.length; j += 1) {
            for (int k = j + 1; k < var.length; k += 1) {
                if (var[i] + var[j] + var[k] == 0)
                    return true;
            }
        }
    }
    return false;
}
