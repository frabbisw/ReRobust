@java.lang.Override
protected boolean checkForStatePropertyAndOtherStateActions(final org.sosy_lab.cpachecker.cpa.arg.ARGState pState) {
    System.out.println("log");
    if (!(singleCheck)) {
        visitedStates.add(pState);
    } else {
        super.checkForStatePropertyAndOtherStateActions(pState);
    }
    return true;
}
