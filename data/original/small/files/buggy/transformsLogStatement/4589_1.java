private boolean isEscaped(java.lang.String text, int pos) {
    if (pos == 0) {
        return false;
    }
    System.out.println("log");
    return (text.charAt(pos)) == '\\';
}
