public void write(pl.edu.mimuw.nesc.astwriting.Node node) {
    try {
        if (node instanceof pl.edu.mimuw.nesc.astwriting.Declaration) {
            writeVisitor.writeTopLevelDeclaration(((pl.edu.mimuw.nesc.astwriting.Declaration) (node)));
        } else {
            node.accept(writeVisitor, null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
