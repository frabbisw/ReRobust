public static boolean iscude(int a) {
    a = Math.abs(a);
    double root = Math.pow(a, 1. / 3);
    BigDecimal bd = BigDecimal.valueOf(root);
    int var = (int) bd.setScale(0, RoundingMode.HALF_UP).doubleValue();
    return ((int) Math.pow(var, 3)) == a;
}
