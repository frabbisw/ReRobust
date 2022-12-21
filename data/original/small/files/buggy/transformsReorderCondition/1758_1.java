public java.lang.String getLevelStr() {
    if (0 != (getCalcedLevel())) {
        return ((getCalcedLevel()) + "/") + (level);
    } else {
        return getString(R.string.none);
    }
}
