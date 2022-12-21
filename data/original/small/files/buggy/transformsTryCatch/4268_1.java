@java.lang.Override
public boolean hasNext() {
    try {
        while (!(mRhsIterator.hasNext())) {
            nextLhs();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mRhsIterator.hasNext();
}
