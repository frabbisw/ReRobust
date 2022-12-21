org.cojen.tupl.TreeCursorFrame pop() {
    try {
        unbind();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.cojen.tupl.TreeCursorFrame parent = mParentFrame;
    mNode = null;
    mParentFrame = null;
    mNotFoundKey = null;
    return parent;
}
