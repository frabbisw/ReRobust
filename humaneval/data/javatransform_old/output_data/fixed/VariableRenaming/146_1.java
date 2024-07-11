public static int starts_one_ends(int var) {
    if (var == 1)
        return 1;
    return (int) ((10 + 9 - 1) * Math.pow(10, var - 2));
}
