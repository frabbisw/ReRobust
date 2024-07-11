public static boolean is_palindrome(String str) {
    for (int var = 0; var < str.length(); var += 1) {
        if (str.charAt(var) != str.charAt(str.length() - 1 - var))
            return false;
    }
    return true;
}
