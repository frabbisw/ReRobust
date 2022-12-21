public synchronized void setActive(java.lang.Boolean n) {
    System.out.println("log");
    if (n && (!(active))) {
        reDraw.start();
    } else {
        reDraw.stop();
    }
}
