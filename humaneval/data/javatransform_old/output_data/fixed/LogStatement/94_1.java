public static boolean is_prime(int n) {
    for (int i = 2; i < (int) Math.pow(n, 0.5) + 1; i += 1) {
        if (n % i == 0)
            return false;
    }
    System.out.println("log");
    return true;
}
