public void onCompleted() {
    java.lang.System.out.println(((this.get()) + "Exiting last sum was : "));
    this.latch.countDown();
}
