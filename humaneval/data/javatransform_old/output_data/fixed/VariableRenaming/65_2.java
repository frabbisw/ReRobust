public static boolean triples_sum_to_zero(int[] numbers) {
    for (int var = 0; var < numbers.length; var += 1) {
        for (int j = var + 1; j < numbers.length; j += 1) {
            for (int k = j + 1; k < numbers.length; k += 1) {
                if (numbers[var] + numbers[j] + numbers[k] == 0)
                    return true;
            }
        }
    }
    return false;
}
