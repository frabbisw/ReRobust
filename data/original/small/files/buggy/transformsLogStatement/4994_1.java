@java.lang.Override
public java.lang.Integer doRun(java.lang.Void _void) {
    System.out.println("log");
    try {
        java.lang.System.out.println("Preparing the 0...");
        java.lang.Thread.sleep(1000L);
        java.lang.System.out.println("0 prepared after one second");
        throw new java.lang.RuntimeException();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}
