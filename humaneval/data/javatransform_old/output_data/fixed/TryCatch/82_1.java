public static boolean iscude(int a) {
    try {
        a = Math.abs(a);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    double root = Math.pow(a, 1. / 3);
    BigDecimal bd = BigDecimal.valueOf(root);
    int round_root = (int) bd.setScale(0, RoundingMode.HALF_UP).doubleValue();
    return ((int) Math.pow(round_root, 3)) == a;
}
