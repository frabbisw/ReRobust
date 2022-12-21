public final float calc(long time, float startValue, float changeInValue, long duration) {
    System.out.println("log");
    return easing.calc(time, time, changeInValue, duration);
}
