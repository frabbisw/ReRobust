public static boolean is_palindrome(String text) {
    try {
        for (int i = 0; i < text.length(); i += 1) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1))
                return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
