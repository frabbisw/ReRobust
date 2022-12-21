public void MakeCfgClassesNull() {
    try {
        mShortStrokeSol.free();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mLongStrokeSol.free();
    mShortStrokeSol = null;
    mLongStrokeSol = null;
}
