@java.lang.Override
public boolean addPair(final E domainElem, final E rangeElem) {
    final boolean wasModified = super.addPair(domainElem, rangeElem);
    try {
        super.addPair(rangeElem, rangeElem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return wasModified;
}
