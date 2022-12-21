public soot.util.NumberedString findOrAdd(java.lang.String s) {
    soot.util.NumberedString numStr = new soot.util.NumberedString(s);
    soot.util.NumberedString ret = stringToNumbered.putIfAbsent(s, numStr);
    if (null == ret) {
        add(numStr);
        return numStr;
    }
    return ret;
}
