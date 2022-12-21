public void reset(org.ggp.base.util.propnet.polymorphic.forwardDeadReckon.ForwardDeadReckonInternalMachineState xiState) {
    this.mState = xiState;
    try {
        mFirstIndex = xiState.contents.nextSetBit(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mIndex = mFirstIndex;
    mLastIndex = -1;
}
