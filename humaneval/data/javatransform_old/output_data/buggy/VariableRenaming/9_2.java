public static boolean simplify(String x, String var) {
    int a = Integer.parseInt(x.split("/")[0]);
    int b = Integer.parseInt(x.split("/")[1]);
    int c = Integer.parseInt(var.split("/")[0]);
    int d = Integer.parseInt(var.split("/")[1]);
    int numerator = a * c;
    int denom = b * d;
    if (numerator / denom == (int) (numerator / denom))
        return true;
    return false;
}
