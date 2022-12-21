public boolean isArc(int v1, int v2) {
    try {
        if (toBoolean(mGraph.get(((v1 * (mSize)) + v2)))) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
