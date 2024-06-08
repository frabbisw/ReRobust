public static int can_arrange(int[] arr) {
    int ind = 1;
    {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1])
                ind = i + 1;
            i++;
        }
    }
    return ind;
}
