public void press() {
    try {
        if (!(cmds.isEmpty())) {
            cmds.remove(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
