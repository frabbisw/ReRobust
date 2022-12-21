public Type peek() {
    try {
        if (isEmpty()) {
            throw new java.lang.NullPointerException();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return myTopNode.myItem;
}
