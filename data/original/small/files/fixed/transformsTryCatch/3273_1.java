java.lang.String getReferenceStack() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("\nReference stack is below.\n");
    try {
        for (java.lang.String e : stack) {
            sb.append(e);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sb.toString();
}
