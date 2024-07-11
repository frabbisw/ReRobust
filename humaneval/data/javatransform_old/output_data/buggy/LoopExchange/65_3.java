public static boolean triples_sum_to_zero(int[] numbers) {
    for (int i = 0; i < numbers.length; i += 1) {
        for (int j = i; j < numbers.length; j += 1) {
            {
                int k = j;
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
