public void pop() {
    try {
        if (!(isEmpty())) {
            (index)--;
        } else {
            java.lang.System.out.println("Empty Stack, nothing to pop");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
