public synchronized void setActive(java.lang.Boolean n) {
    try {
        if (n && (!(active))) {
            reDraw.start();
        } else {
            reDraw.stop();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
