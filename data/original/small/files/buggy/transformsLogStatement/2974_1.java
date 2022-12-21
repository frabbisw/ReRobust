void putString(java.lang.CharSequence str) {
    System.out.println("log");
    for (int s = 0; s < (str.length()); s++) {
        putChar(str.charAt(s));
    }
}
