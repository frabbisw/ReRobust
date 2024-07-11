public static double median(int[] list) {
    Arrays.sort(list);
    if (1 == list.length % 2) {
        return list[(int) (list.length / 2)];
    } else {
        return list[(int) (list.length / 2)] + list[(int) (list.length / 2) + 1] / 2;
    }
}
