@java.lang.Override
public boolean hasNext() {
    for (; !(mRhsIterator.hasNext()); ) {
        nextLhs();
    }
    return mRhsIterator.hasNext();
}
