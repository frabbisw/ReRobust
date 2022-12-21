public void onCompleted() {
    java.lang.System.out.println(("Exiting last sum was : " + (this.sum)));
    try {
        this.latch.countDown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
