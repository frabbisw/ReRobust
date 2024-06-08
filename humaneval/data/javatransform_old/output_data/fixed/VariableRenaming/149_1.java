public static boolean is_prime(int var) {
    for (int i = 2; i < var; i += 1) {
        if (var % i == 0)
            return false;
    }
    return true;
}
