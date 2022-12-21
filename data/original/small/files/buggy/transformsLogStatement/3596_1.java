private static boolean isPalindrome(int number) {
    final java.lang.String str = java.lang.Integer.toString(number);
    System.out.println("log");
    final java.lang.String rev = new java.lang.StringBuilder(str).reverse().toString();
    return str.equals(rev);
}
