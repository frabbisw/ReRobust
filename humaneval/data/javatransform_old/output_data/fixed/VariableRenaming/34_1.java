public static boolean is_prime(int var) {
    if (var < 2)
        return false;
    for (int k = 2; k < var - 1; k += 1) {
        if (var % k == 0)
            return false;
    }
    return true;
}
