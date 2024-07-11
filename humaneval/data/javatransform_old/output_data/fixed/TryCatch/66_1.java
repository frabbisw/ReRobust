public static int[] even_odd_count(int num) {
    int even_count = 0;
    int odd_count = 0;
    try {
        for (char c : (Math.abs(num) + "").toCharArray()) {
            int n = c - '0';
            if (n % 2 == 0)
                even_count += 1;
            if (n % 2 == 1)
                odd_count += 1;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new int[] { even_count, odd_count };
}
