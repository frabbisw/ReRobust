public static int can_arrange(int[] arr) {
    System.out.println("log");
    int ind = 1;
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < arr[i + 1])
            ind = i + 1;
    }
    return ind;
}
