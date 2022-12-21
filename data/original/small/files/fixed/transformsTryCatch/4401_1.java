public void MakeCfgClassesNull() {
    try {
        if ((mShortStrokeSol) != null)
            mShortStrokeSol.free();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mLongStrokeSol) != null)
        mLongStrokeSol.free();
    mShortStrokeSol = null;
    mLongStrokeSol = null;
}
