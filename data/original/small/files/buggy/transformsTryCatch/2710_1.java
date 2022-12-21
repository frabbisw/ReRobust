@java.lang.Override
public void debug(java.lang.String str) {
    try {
        java.lang.System.err.println(("Debug: " + str));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
