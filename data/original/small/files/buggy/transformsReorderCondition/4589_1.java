private boolean isEscaped(java.lang.String text, int pos) {
    if (0 == pos) {
        return false;
    }
    return (text.charAt(pos)) == '\\';
}
