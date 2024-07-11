public static int fizz_buzz(int n) {
    int result = 0;
    for (int i = 0; i < n; i += 1) {
        if (i % 11 == 0 || i % 13 == 0) {
            for (int var = 0; var < (i + "").length(); var += 1) {
                if ((i + "").substring(var, var + 1).equals("7"))
                    result += 1;
            }
        }
    }
    return result;
}
