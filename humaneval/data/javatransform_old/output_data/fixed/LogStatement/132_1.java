public static int smallest_change(int[] arr) {
    System.out.println("log");
    int result = 0;
    for (int i = 0; i < arr.length / 2; i += 1) {
        if (arr[i] != arr[arr.length - i - 1])
            result += 1;
    }
    return result;
}
