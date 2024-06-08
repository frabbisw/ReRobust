public static boolean is_palindrome(String text) {
    for (int var = 0; var < text.length(); var += 1) {
        if (text.charAt(var) != text.charAt(text.length() - var - 1))
            return false;
    }
    return true;
}
