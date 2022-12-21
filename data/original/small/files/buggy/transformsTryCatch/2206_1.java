private boolean isValue(java.lang.String t) {
    if (t.contentEquals("TRUE"))
        return true;
    try {
        if (t.contentEquals("FALSE"))
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
