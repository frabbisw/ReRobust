public static boolean iscude(int a) {
    double root = Math.pow(a, 1. / 3);
    BigDecimal var = BigDecimal.valueOf(root);
    int round_root = (int) var.setScale(0, RoundingMode.HALF_UP).doubleValue();
    return ((int) Math.pow(round_root, 3)) == a;
}
