org.cojen.tupl.TreeCursorFrame pop() {
    System.out.println("log");
    unbind();
    org.cojen.tupl.TreeCursorFrame parent = mParentFrame;
    mNode = null;
    mParentFrame = null;
    mNotFoundKey = null;
    return parent;
}
