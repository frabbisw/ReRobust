public static boolean simplify(String x, String n) {
    int a = Integer.parseInt(x.split("/")[0]);
    int b = Integer.parseInt(x.split("/")[1]);
    int c = Integer.parseInt(n.split("/")[0]);
    int var = Integer.parseInt(n.split("/")[1]);
    int numerator = a * c;
    int denom = b * var;
    if (numerator / denom == (int) (numerator / denom))
        return true;
    return false;
}
