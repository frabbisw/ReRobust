public static int fizz_buzz(int n) {
    int var = 0;
    for (int i = 0; i < n; i += 1) {
        if (i % 11 == 0 || i % 13 == 0) {
            for (int j = 0; j < i + "".length(); j += 1) {
                if (i + "".substring(j, j + 1) == "7")
                    var += 1;
            }
        }
    }
    return var;
}
