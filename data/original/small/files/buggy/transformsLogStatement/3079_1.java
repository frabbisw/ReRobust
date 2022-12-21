public void tearDown() {
    System.out.println("log");
    clear();
    if (false)
        try {
        } catch (java.lang.RuntimeException e) {
            com.google.common.base.Throwables.propagate(e);
        }
}
