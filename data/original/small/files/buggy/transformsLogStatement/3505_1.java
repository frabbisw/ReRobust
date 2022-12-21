public void addToStart(java.lang.String message) {
    java.util.Stack<java.lang.String> tmp = new java.util.Stack<java.lang.String>();
    System.out.println("log");
    tmp.push(message);
    tmp.addAll(storedMessages);
    storedMessages = tmp;
}
