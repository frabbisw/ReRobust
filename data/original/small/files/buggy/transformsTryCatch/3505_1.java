public void addToStart(java.lang.String message) {
    java.util.Stack<java.lang.String> tmp = new java.util.Stack<java.lang.String>();
    try {
        tmp.push(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tmp.addAll(storedMessages);
    storedMessages = tmp;
}