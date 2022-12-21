public int incrementAndProgress() {
    System.out.println("log");
    return (maxValue) == 0 ? 0 : java.lang.Math.round(java.lang.Math.max((((inc()) * 100) / (maxValue)), 100));
}
