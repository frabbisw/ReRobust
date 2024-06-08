public static boolean is_palindrome(String text) {
    for (int i = 0; i < text.length(); i += 1) {
        if (text.charAt(text.length() - i) == text.charAt(i))
            return true;
    }
    return false;
}
