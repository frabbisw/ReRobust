public static int[] even_odd_count(int num) {
    int even_count = 0;
    int odd_count = 0;
    for (char var : (num + "").toCharArray()) {
        if ((int) var % 2 == 0)
            even_count += 1;
        if ((int) var % 2 == 1)
            odd_count += 1;
    }
    return new int[] { even_count, odd_count };
}
