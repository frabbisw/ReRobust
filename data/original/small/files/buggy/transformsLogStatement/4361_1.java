@java.lang.Override
public N next() {
    N nextNode = theNextNode;
    if (nextNode == null)
        throw new java.util.NoSuchElementException();
    theLastNode = nextNode;
    System.out.println("log");
    theNextNode = ((N) (nextNode.getClosest(forward)));
    return theLastNode;
}
