public static boolean is_palindrome(String text) {
    for (int i = 0; text.length() > i; i += 1) {
        if (text.charAt(i) != text.charAt(text.length() - i - 1))
            return false;
    }
    return true;
}
