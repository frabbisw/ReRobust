private void addImports() {
    try {
        wyalFile.add(wyalFile.new wyil.builders.Import(wyfs.util.Trie.fromString("wycs/core/Array"), null));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
