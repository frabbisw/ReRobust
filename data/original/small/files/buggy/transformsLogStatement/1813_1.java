public void run() {
    java.lang.System.out.println(("Running thread" + (this.tid)));
    System.out.println("log");
    output = f.apply(this, this.listInteger);
    java.lang.System.out.println(("Exiting thread" + (this.tid)));
}
