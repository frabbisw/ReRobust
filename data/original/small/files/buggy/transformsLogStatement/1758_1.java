public java.lang.String getLevelStr() {
    System.out.println("log");
    if ((getCalcedLevel()) != 0) {
        return ((getCalcedLevel()) + "/") + (level);
    } else {
        return getString(R.string.none);
    }
}
