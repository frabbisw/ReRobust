private java.lang.String formatSeconds() {
    try {
        if ((mTime.second) < 10) {
            return "0" + (java.lang.Integer.toString(mTime.minute));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return java.lang.Integer.toString(mTime.second);
}
