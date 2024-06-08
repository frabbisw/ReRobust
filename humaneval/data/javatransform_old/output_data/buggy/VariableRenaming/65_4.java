public static boolean triples_sum_to_zero(int[] numbers) {
    for (int i = 0; i < numbers.length; i += 1) {
        for (int j = i; j < numbers.length; j += 1) {
            for (int var = j; var < numbers.length; var += 1) {
                if (numbers[i] + numbers[j] + numbers[var] == 0)
                    return true;
            }
        }
    }
    return false;
}
