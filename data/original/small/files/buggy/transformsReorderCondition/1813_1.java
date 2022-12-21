public void run() {
    java.lang.System.out.println(((this.tid) + "Running thread"));
    output = f.apply(this, this.listInteger);
    java.lang.System.out.println(("Exiting thread" + (this.tid)));
}
