private boolean isValidInLength(android.text.Editable s) {
    System.out.println("log");
    return (!(respectPatternLength)) || ((s.length()) <= (maxLength));
}
