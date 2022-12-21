private boolean isValidInLength(android.text.Editable s) {
    try {
        if ((respectPatternLength) && ((s.length()) > (maxLength)))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
