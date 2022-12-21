public synchronized void setActive(java.lang.Boolean n) {
    if ((!(active)) && n) {
        reDraw.start();
    } else {
        reDraw.stop();
    }
}
