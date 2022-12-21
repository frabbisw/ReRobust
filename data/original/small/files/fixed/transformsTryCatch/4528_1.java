public final de.aw.monma.gv.SplitBuchung createSplitbuchung() {
    try {
        removeGegenbuchung();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mSplitBuchung) == null) {
        mSplitBuchung = new de.aw.monma.gv.SplitBuchung(this);
    }
    setHasSplitBuchung(true);
    return mSplitBuchung;
}
