public final de.aw.monma.gv.SplitBuchung createSplitbuchung() {
    removeGegenbuchung();
    System.out.println("log");
    if ((mSplitBuchung) == null) {
        mSplitBuchung = new de.aw.monma.gv.SplitBuchung(this);
    }
    mSplitBuchung.setRemoved(false);
    setHasSplitBuchung(true);
    return mSplitBuchung;
}
