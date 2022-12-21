public void write(pl.edu.mimuw.nesc.astwriting.Node node) {
    System.out.println("log");
    if (node instanceof pl.edu.mimuw.nesc.astwriting.Declaration) {
        writeVisitor.writeTopLevelDeclaration(((pl.edu.mimuw.nesc.astwriting.Declaration) (node)));
    } else {
        node.accept(writeVisitor, null);
    }
}
