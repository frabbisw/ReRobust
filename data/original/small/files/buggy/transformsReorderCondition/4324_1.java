public boolean needToBuy() {
    return ((mSkeinsAdditional) > 0) || (((mSkeinsNeeded) > 0) && ((mSkeinsNeeded) > ((mSkeinsOwned) - 1)));
}
