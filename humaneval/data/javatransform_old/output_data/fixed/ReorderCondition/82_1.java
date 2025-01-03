public static boolean iscude(int a) {
    a = Math.abs(a);
    double root = Math.pow(a, 1. / 3);
    BigDecimal bd = BigDecimal.valueOf(root);
    int round_root = (int) bd.setScale(0, RoundingMode.HALF_UP).doubleValue();
    return a == ((int) Math.pow(round_root, 3));
}
