public static boolean isValidString(java.lang.String string) {
    if (string == null)
        return false;
    try {
        if (string.isEmpty())
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
