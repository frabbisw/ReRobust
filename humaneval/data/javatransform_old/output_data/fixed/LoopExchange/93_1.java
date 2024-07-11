public static boolean is_palindrome(String str) {
    {
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
            i += 1;
        }
    }
    return true;
}
