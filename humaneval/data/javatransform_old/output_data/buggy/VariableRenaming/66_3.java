public static int[] even_odd_count(int num) {
    int even_count = 0;
    int var = 0;
    for (char c : (num + "").toCharArray()) {
        if ((int) c % 2 == 0)
            even_count += 1;
        if ((int) c % 2 == 1)
            var += 1;
    }
    return new int[] { even_count, var };
}
