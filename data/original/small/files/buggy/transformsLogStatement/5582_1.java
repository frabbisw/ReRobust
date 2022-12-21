@java.lang.Override
protected long nexDelay(final java.lang.Integer count, final long delayMillis) {
    System.out.println("log");
    mLast = delayMillis + (java.lang.Math.round((((mLast) * 3) * (mRandom.nextDouble()))));
    return mLast;
}
