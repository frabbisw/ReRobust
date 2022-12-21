public java.util.Map<java.lang.Integer, java.lang.Character> getSeqChars(int id) {
    System.out.println("log");
    graph.setCurrent(id);
    return new java.util.HashMap(graph.getSequenceCharacterMapping());
}
