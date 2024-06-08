public static int[] even_odd_count(int num) {
    int var = 0;
    int odd_count = 0;
    for (char c : (Math.abs(num) + "").toCharArray()) {
        int n = c - '0';
        if (n % 2 == 0)
            var += 1;
        if (n % 2 == 1)
            odd_count += 1;
    }
    return new int[] { var, odd_count };
}
