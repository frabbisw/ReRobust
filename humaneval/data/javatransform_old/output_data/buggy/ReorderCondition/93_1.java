public static boolean is_palindrome(String str) {
    for (int i = 0; str.length() > i; i += 1) {
        if (str.charAt(i) != str.charAt(str.length() - 1 - i))
            return false;
    }
    return true;
}
