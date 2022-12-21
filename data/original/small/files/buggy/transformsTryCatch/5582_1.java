@java.lang.Override
protected long nexDelay(final java.lang.Integer count, final long delayMillis) {
    try {
        mLast = delayMillis + (java.lang.Math.round((((mLast) * 3) * (mRandom.nextDouble()))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mLast;
}
