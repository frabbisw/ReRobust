@java.lang.Override
protected boolean checkForStatePropertyAndOtherStateActions(final org.sosy_lab.cpachecker.cpa.arg.ARGState pState) {
    try {
        if (!(singleCheck)) {
            visitedStates.add(pState);
        } else {
            super.checkForStatePropertyAndOtherStateActions(pState);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
