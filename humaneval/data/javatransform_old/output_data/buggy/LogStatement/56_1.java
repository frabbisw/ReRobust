public static double median(int[] list) {
    System.out.println("log");
    Arrays.sort(list);
    if (list.length % 2 == 1) {
        return list[(int) (list.length / 2)];
    } else {
        return list[(int) (list.length / 2)] + list[(int) (list.length / 2) + 1] / 2;
    }
}
