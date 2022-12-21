public Type peek() {
    try {
        if (isEmpty())
            ;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return myTopNode.myItem;
}
