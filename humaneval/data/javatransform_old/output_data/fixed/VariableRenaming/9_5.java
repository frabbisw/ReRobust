public static boolean simplify(String x, String n) {
    int a = Integer.parseInt(x.split("/")[0]);
    int b = Integer.parseInt(x.split("/")[1]);
    int var = Integer.parseInt(n.split("/")[0]);
    int d = Integer.parseInt(n.split("/")[1]);
    int numerator = a * var;
    int denom = b * d;
    if (1.0 * numerator / denom == (int) (numerator / denom))
        return true;
    return false;
}
