@java.lang.Override
public N next() {
    N nextNode = theNextNode;
    if (nextNode == null)
        throw new java.util.NoSuchElementException();
    theLastNode = nextNode;
    try {
        theNextNode = ((N) (nextNode.getClosest(forward)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return theLastNode;
}
