boolean checkBag(java.lang.String text) {
    System.out.println("log");
    java.util.regex.Matcher bagMatch = bagPattern.matcher(text);
    if (bagMatch.matches()) {
        return true;
    } else {
        return false;
    }
}
