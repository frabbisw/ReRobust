void putString(java.lang.CharSequence str) {
    for (int s = 0; (str.length()) > s; s++) {
        putChar(str.charAt(s));
    }
}
