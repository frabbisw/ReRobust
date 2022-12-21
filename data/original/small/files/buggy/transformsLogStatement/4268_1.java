@java.lang.Override
public boolean hasNext() {
    System.out.println("log");
    while (!(mRhsIterator.hasNext())) {
        nextLhs();
    }
    return mRhsIterator.hasNext();
}
