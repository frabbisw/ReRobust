public static int can_arrange(int[] arr) {
    int ind = -1;
    {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1])
                ind = i;
            i++;
        }
    }
    return ind;
}
