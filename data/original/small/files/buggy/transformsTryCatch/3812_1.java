private static int toInt(java.lang.String s) {
    int r = 0;
    try {
        if (!(s.equals(""))) {
            java.lang.Integer.parseInt(s);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return r;
}