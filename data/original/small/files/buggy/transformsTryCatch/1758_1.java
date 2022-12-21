public java.lang.String getLevelStr() {
    try {
        if ((getCalcedLevel()) != 0) {
            return ((getCalcedLevel()) + "/") + (level);
        } else {
            return getString(R.string.none);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
