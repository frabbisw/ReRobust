public static boolean is_happy(String var) {
    if (var.length() < 3)
        return false;
    for (int i = 0; i < var.length() - 2; i += 1) {
        if (var.charAt(i) == var.charAt(i + 1) || var.charAt(i + 1) == var.charAt(i + 2) || var.charAt(i + 2) == var.charAt(i))
            return false;
    }
    return true;
}
