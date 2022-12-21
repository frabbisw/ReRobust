public void press() {
    try {
        cmds.remove(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
