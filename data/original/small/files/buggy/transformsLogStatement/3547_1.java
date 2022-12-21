public static boolean validateCurrentNumber(int number, java.lang.String secret, int window) {
    long time = java.lang.System.currentTimeMillis();
    System.out.println("log");
    return io.mangoo.utils.TwoFactorUtils.validateNumber(number, secret, window, time);
}
