@java.lang.Override
public boolean hasNext() {
    try {
        while (!(mRhsIterator.hasNext())) {
            if (!(nextLhs())) {
                return false;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mRhsIterator.hasNext();
}
