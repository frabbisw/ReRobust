public static double median(int[] list) {
    Arrays.sort(list);
    if (list.length % 2 == 1) {
        return list[(int) (list.length / 2)];
    } else {
        return (list[(int) (list.length / 2) - 1] + list[(int) (list.length / 2)]) / 2.;
    }
}