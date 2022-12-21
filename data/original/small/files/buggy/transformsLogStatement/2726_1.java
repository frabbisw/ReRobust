@java.lang.Override
public boolean addPair(final E domainElem, final E rangeElem) {
    System.out.println("log");
    final boolean wasModified = super.addPair(domainElem, rangeElem);
    super.addPair(rangeElem, rangeElem);
    return wasModified;
}
