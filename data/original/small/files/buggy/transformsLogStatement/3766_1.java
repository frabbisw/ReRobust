public void onCompleted() {
    System.out.println("log");
    java.lang.System.out.println(("Exiting last sum was : " + (this.get())));
    this.latch.countDown();
}
