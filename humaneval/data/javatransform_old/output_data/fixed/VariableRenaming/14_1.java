public static boolean is_palindrome(String var) {
    for (int i = 0; i < var.length(); i += 1) {
        if (var.charAt(i) != var.charAt(var.length() - i - 1))
            return false;
    }
    return true;
}
