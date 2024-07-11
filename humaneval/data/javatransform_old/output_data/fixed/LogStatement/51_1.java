public static int can_arrange(int[] arr) {
    int ind = -1;
    System.out.println("log");
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1])
            ind = i;
    }
    return ind;
}
