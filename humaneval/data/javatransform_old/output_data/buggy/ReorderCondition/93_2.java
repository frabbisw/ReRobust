public static boolean is_palindrome(String str) {
    for (int i = 0; i < str.length(); i += 1) {
        if (str.charAt(str.length() - 1 - i) != str.charAt(i))
            return false;
    }
    return true;
}
