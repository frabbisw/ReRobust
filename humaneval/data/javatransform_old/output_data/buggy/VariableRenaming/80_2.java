public static int[] sort_array(int[] array) {
    if (array.length == 0)
        return array;
    Arrays.sort(array);
    if ((array[0] + array[array.length - 1]) % 2 == 1)
        return array;
    else {
        for (int var = 0; var < array.length / 2; var += 1) {
            array[var] = array[array.length - var - 1];
            array[array.length - var - 1] = array[var];
        }
        return array;
    }
}
