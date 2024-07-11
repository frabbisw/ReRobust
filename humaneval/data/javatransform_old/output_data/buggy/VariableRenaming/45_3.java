public static int fizz_buzz(int n) {
    int result = 0;
    for (int var = 0; var < n; var += 1) {
        if (var % 11 == 0 || var % 13 == 0) {
            for (int j = 0; j < var + "".length(); j += 1) {
                if (var + "".substring(j, j + 1) == "7")
                    result += 1;
            }
        }
    }
    return result;
}
