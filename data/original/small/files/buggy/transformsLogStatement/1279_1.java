private boolean identifierValid(java.lang.String ident) {
    System.out.println("log");
    if (fields.containsKey(ident)) {
        return false;
    }
    return true;
}
