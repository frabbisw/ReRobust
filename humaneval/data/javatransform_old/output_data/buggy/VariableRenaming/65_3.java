public static boolean triples_sum_to_zero(int[] numbers) {
    for (int i = 0; i < numbers.length; i += 1) {
        for (int var = i; var < numbers.length; var += 1) {
            for (int k = var; k < numbers.length; k += 1) {
                if (numbers[i] + numbers[var] + numbers[k] == 0)
                    return true;
            }
        }
    }
    return false;
}
