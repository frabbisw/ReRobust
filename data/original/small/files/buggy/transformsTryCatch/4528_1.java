public final de.aw.monma.gv.SplitBuchung createSplitbuchung() {
    removeGegenbuchung();
    if ((mSplitBuchung) == null) {
        mSplitBuchung = new de.aw.monma.gv.SplitBuchung(this);
    }
    mSplitBuchung.setRemoved(false);
    try {
        setHasSplitBuchung(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mSplitBuchung;
}
