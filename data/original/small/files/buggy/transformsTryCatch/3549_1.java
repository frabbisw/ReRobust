@java.lang.Override
public java.lang.Void run() {
    final java.lang.String[] args = new java.lang.String[] { "-xargs", getAbsolutePath("props.xargs"), "-xargs", getAbsolutePath("init.xargs") };
    try {
        org.knopflerfish.framework.Main.main(args);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
