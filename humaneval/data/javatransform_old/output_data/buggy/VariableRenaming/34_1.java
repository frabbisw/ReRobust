public static boolean is_prime(int var) {
    if (var < 2)
        return false;
    for (int k = 0; k < var; k += 1) {
        if (var % k == 0)
            return false;
    }
    return true;
}
