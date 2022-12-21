public void removeapplet(processing.core.PApplet tem) {
    try {
        mainapplet.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    remove(tem);
}
