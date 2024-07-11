public static int fizz_buzz(int n) {
    int result = 0;
    for (int i = 0; i < n; i += 1) {
        if (i % 11 == 0 || i % 13 == 0) {
            {
                int j = 0;
                while (j < i + "".length()) {
                    if (i + "".substring(j, j + 1) == "7")
                        result += 1;
                    j += 1;
                }
            }
        }
    }
    return result;
}
