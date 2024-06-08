public static boolean iscude(int var) {
    var = Math.abs(var);
    double root = Math.pow(var, 1. / 3);
    BigDecimal bd = BigDecimal.valueOf(root);
    int round_root = (int) bd.setScale(0, RoundingMode.HALF_UP).doubleValue();
    return ((int) Math.pow(round_root, 3)) == var;
}
