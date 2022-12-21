public java.util.Map<java.lang.Integer, java.lang.Character> getSeqChars(int id) {
    try {
        graph.setCurrent(id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new java.util.HashMap(graph.getSequenceCharacterMapping());
}
