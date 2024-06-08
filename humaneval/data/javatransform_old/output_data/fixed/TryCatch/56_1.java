public static double median(int[] list) {
    try {
        Arrays.sort(list);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (list.length % 2 == 1) {
        return list[(int) (list.length / 2)];
    } else {
        return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
    }
}
