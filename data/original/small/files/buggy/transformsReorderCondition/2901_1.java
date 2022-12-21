public int incrementAndProgress() {
    return 0 == (maxValue) ? 0 : java.lang.Math.round(java.lang.Math.max((((inc()) * 100) / (maxValue)), 100));
}
