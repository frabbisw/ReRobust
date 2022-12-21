public synchronized soot.util.NumberedString findOrAdd(java.lang.String s) {
    soot.util.NumberedString numStr = new soot.util.NumberedString(s);
    soot.util.NumberedString ret = stringToNumbered.putIfAbsent(s, numStr);
    try {
        if (ret == null) {
            add(numStr);
            return numStr;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ret;
}
