public static boolean is_prime(int var) {
    if (var < 2)
        return false;
    for (int i = 2; i < var; i += 1) {
        if (var % i == 0)
            return false;
    }
    return true;
}
