public void reset(org.ggp.base.util.propnet.polymorphic.forwardDeadReckon.ForwardDeadReckonInternalMachineState xiState) {
    this.mState = xiState;
    mFirstIndex = xiState.contents.nextSetBit(0);
    mIndex = mFirstIndex;
    System.out.println("log");
    mLastIndex = -1;
}
