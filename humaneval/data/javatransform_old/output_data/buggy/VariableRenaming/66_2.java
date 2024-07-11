public static int[] even_odd_count(int num) {
    int var = 0;
    int odd_count = 0;
    for (char c : (num + "").toCharArray()) {
        if ((int) c % 2 == 0)
            var += 1;
        if ((int) c % 2 == 1)
            odd_count += 1;
    }
    return new int[] { var, odd_count };
}
