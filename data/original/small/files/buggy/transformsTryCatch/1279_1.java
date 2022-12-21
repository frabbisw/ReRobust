private boolean identifierValid(java.lang.String ident) {
    try {
        if (fields.containsKey(ident)) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
