@java.lang.Override
public N next() {
    N nextNode = theNextNode;
    if (null == nextNode)
        throw new java.util.NoSuchElementException();
    theLastNode = nextNode;
    theNextNode = ((N) (nextNode.getClosest(forward)));
    return theLastNode;
}
