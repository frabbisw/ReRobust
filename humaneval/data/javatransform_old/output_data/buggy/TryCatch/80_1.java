public static int[] sort_array(int[] array) {
    if (array.length == 0)
        return array;
    try {
        Arrays.sort(array);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((array[0] + array[array.length - 1]) % 2 == 1)
        return array;
    else {
        for (int i = 0; i < array.length / 2; i += 1) {
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
        }
        return array;
    }
}
