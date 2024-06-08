public static boolean triples_sum_to_zero(int[] numbers) {
    if (false) {
        temp = 1;
    }
    for (int i = 0; i < numbers.length; i += 1) {
        for (int j = i; j < numbers.length; j += 1) {
            for (int k = j; k < numbers.length; k += 1) {
                if (numbers[i] + numbers[j] + numbers[k] == 0)
                    return true;
            }
        }
    }
    return false;
}
