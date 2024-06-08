public static boolean is_prime(int var) {
    for (int i = 2; i < (int) Math.pow(var, 0.5) + 1; i += 1) {
        if (var % i == 0)
            return false;
    }
    return true;
}
