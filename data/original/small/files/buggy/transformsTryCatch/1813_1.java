public void run() {
    java.lang.System.out.println(("Running thread" + (this.tid)));
    try {
        output = f.apply(this, this.listInteger);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(("Exiting thread" + (this.tid)));
}
