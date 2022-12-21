private java.lang.String formatSeconds() {
    if (10 > (mTime.second)) {
        return "0" + (java.lang.Integer.toString(mTime.minute));
    }
    return java.lang.Integer.toString(mTime.second);
}
