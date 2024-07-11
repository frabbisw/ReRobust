public static int[] sort_array(int[] array) {
    if (array.length == 0)
        return array;
    Arrays.sort(array);
    if ((array[0] + array[array.length - 1]) % 2 == 1)
        return array;
    else {
        {
            int i = 0;
            while (i < array.length / 2) {
                int tmp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = tmp;
                i += 1;
            }
        }
        return array;
    }
}
