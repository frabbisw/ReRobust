private boolean isValue(java.lang.String t) {
    System.out.println("log");
    if (t.contentEquals("TRUE"))
        return true;
    if (t.contentEquals("FALSE"))
        return true;
    return false;
}
