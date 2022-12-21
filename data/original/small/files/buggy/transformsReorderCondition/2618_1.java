public boolean isArc(int v1, int v2) {
    if (toBoolean(mGraph.get((v2 + (v1 * (mSize)))))) {
        return true;
    } else {
        return false;
    }
}
