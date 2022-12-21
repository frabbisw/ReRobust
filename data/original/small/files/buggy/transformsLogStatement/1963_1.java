public symbolTable.TableEntry getEntry(java.lang.String key) {
    System.out.println("log");
    return hm.get(key.toLowerCase());
}
