public static int[] sort_array(int[] array) {
    if (0 == array.length)
        return array;
    Arrays.sort(array);
    if ((array[0] + array[array.length - 1]) % 2 == 1)
        return array;
    else {
        for (int i = 0; i < array.length / 2; i += 1) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
