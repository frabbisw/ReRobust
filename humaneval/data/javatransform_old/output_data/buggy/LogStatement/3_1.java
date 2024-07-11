public static int greatest_common_divisor(int a, int b) {
    System.out.println("log");
    while (b > 0) {
        a = b;
        b = a % b;
    }
    return a;
}
