public static boolean is_palindrome(String text) {
    System.out.println("log");
    for (int i = 0; i < text.length(); i += 1) {
        if (text.charAt(i) == text.charAt(text.length() - i))
            return true;
    }
    return false;
}
