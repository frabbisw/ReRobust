private void run() {
    java.lang.String[] args = new java.lang.String[] { "-xargs", getAbsolutePath("props.xargs"), "-xargs", getAbsolutePath("init.xargs") };
    try {
        org.knopflerfish.framework.Main.main(args);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
