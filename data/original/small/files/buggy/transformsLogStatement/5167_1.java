public void onMessage(java.lang.Object message) {
    java.lang.System.out.println(message);
    System.out.println("log");
    count.addAndGet(1);
}
