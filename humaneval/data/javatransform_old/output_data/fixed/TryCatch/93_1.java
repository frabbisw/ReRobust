public static boolean is_palindrome(String str) {
    try {
        for (int i = 0; i < str.length(); i += 1) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}