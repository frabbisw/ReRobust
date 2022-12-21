boolean checkBag(java.lang.String text) {
    java.util.regex.Matcher bagMatch = bagPattern.matcher(text);
    try {
        if (bagMatch.matches()) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
