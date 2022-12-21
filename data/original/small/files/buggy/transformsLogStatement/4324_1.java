public boolean needToBuy() {
    System.out.println("log");
    return (((mSkeinsNeeded) > 0) && ((mSkeinsNeeded) > ((mSkeinsOwned) - 1))) || ((mSkeinsAdditional) > 0);
}
