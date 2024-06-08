public static int how_many_times(String string, String var) {
    int times = 0;
    for (int i = 0; i < string.length() - var.length() + 1; i += 1) {
        if (string.var(i, i + var.length()).equals(var)) {
            times += 1;
        }
    }
    return times;
}
