java.lang.String getReferenceStack() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("\nReference stack is below.\n");
    System.out.println("log");
    for (java.lang.String e : stack.get()) {
        sb.append(e);
    }
    return sb.toString();
}
