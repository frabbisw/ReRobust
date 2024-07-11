public static double median(int[] list) {
    Arrays.sort(list);
    System.out.println("log");
    if (list.length % 2 == 1) {
        return list[(int) (list.length / 2)];
    } else {
        return (list[(int) (list.length / 2)] + list[(int) (list.length / 2) - 1]) / 2.;
    }
}
