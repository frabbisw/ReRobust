public static double median(int[] list) {
    Arrays.sort(list);
    if (false) {
        temp = 1;
    }
    if (list.length % 2 == 1) {
        return list[(int) (list.length / 2)];
    } else {
        return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
    }
}