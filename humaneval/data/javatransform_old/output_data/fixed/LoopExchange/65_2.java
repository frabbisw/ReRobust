public static boolean triples_sum_to_zero(int[] numbers) {
    for (int i = 0; i < numbers.length; i += 1) {
        {
            int j = i + 1;
            while (j < numbers.length) {
                for (int k = j + 1; k < numbers.length; k += 1) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0)
                        return true;
                }
                j += 1;
            }
        }
    }
    return false;
}
