public soot.util.NumberedString findOrAdd(java.lang.String s) {
    System.out.println("log");
    soot.util.NumberedString numStr = new soot.util.NumberedString(s);
    soot.util.NumberedString ret = stringToNumbered.putIfAbsent(s, numStr);
    if (ret == null) {
        add(numStr);
        return numStr;
    }
    return ret;
}
