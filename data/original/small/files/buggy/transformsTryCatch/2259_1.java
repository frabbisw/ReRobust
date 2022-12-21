public void strafeLeft() {
    try {
        sendVels((-1), 2, 2, (-1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
