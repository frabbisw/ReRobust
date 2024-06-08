public static boolean is_prime(int var) {
    if (var < 2)
        return false;
    for (int i = 2; i < (int) Math.sqrt(var) + 1; i += 1) {
        if (var % i == 0)
            return false;
    }
    return true;
}
