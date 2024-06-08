public static boolean simplify(String var, String n) {
    int a = Integer.parseInt(var.split("/")[0]);
    int b = Integer.parseInt(var.split("/")[1]);
    int c = Integer.parseInt(n.split("/")[0]);
    int d = Integer.parseInt(n.split("/")[1]);
    int numerator = a * c;
    int denom = b * d;
    if (numerator / denom == (int) (numerator / denom))
        return true;
    return false;
}
