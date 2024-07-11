public static boolean simplify(String x, String n) {
    int var = Integer.parseInt(x.split("/")[0]);
    int b = Integer.parseInt(x.split("/")[1]);
    int c = Integer.parseInt(n.split("/")[0]);
    int d = Integer.parseInt(n.split("/")[1]);
    int numerator = var * c;
    int denom = b * d;
    if (numerator / denom == (int) (numerator / denom))
        return true;
    return false;
}
