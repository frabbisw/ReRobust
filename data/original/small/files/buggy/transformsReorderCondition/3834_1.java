private boolean isValidInLength(android.text.Editable s) {
    return ((s.length()) <= (maxLength)) || (!(respectPatternLength));
}
