public static boolean is_palindrome(String text) {
    {
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1))
                return false;
            i += 1;
        }
    }
    return true;
}
