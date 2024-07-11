public static boolean triples_sum_to_zero(int[] numbers) {
    for (int i = 0; i < numbers.length; i += 1) {
        for (int j = i + 1; j < numbers.length; j += 1) {
            {
                int k = j + 1;
                while (k < numbers.length) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0)
                        return true;
                    k += 1;
                }
            }
        }
    }
    return false;
}
