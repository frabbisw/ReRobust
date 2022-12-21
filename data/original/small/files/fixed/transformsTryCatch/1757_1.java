public void write(pl.edu.mimuw.nesc.astwriting.Node node) {
    try {
        node.accept(writeVisitor, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
