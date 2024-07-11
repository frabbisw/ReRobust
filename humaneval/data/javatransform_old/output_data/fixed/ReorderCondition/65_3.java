public static boolean triples_sum_to_zero(int[] numbers) {
    for (int i = 0; i < numbers.length; i += 1) {
        for (int j = i + 1; numbers.length > j; j += 1) {
            for (int k = j + 1; k < numbers.length; k += 1) {
                if (numbers[i] + numbers[j] + numbers[k] == 0)
                    return true;
            }
        }
    }
    return false;
}
