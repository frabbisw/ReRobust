public void getValue() {
    try {
        java.lang.System.out.println(tape.get(head).intValue());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
